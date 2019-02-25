package leavesc.hello.databindingsamples.observable;

import android.databinding.ListChangeRegistry;
import android.databinding.ObservableList;
import android.support.annotation.NonNull;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by：CZY
 * Time：2019/2/25 15:59
 * Desc：
 */
public class ObservableArrayList<T> extends ArrayList<T> implements ObservableList<T> {

    private transient ListChangeRegistry listChangeRegistry = new ListChangeRegistry();

    @Override
    public void addOnListChangedCallback(ObservableList.OnListChangedCallback listener) {
        if (listChangeRegistry == null) {
            listChangeRegistry = new ListChangeRegistry();
        }
        listChangeRegistry.add(listener);
    }

    @Override
    public void removeOnListChangedCallback(ObservableList.OnListChangedCallback listener) {
        if (listChangeRegistry != null) {
            listChangeRegistry.remove(listener);
        }
    }

    @Override
    public boolean add(T object) {
        super.add(object);
        notifyAdd(size() - 1, 1);
        return true;
    }

    @Override
    public void add(int index, T object) {
        super.add(index, object);
        notifyAdd(index, 1);
    }

    @Override
    public boolean addAll(@NonNull Collection<? extends T> collection) {
        int oldSize = size();
        boolean added = super.addAll(collection);
        if (added) {
            notifyAdd(oldSize, size() - oldSize);
        }
        return added;
    }

    @Override
    public boolean addAll(int index, @NonNull Collection<? extends T> collection) {
        boolean added = super.addAll(index, collection);
        if (added) {
            notifyAdd(index, collection.size());
        }
        return added;
    }

    @Override
    public T remove(int index) {
        T val = super.remove(index);
        notifyRemove(index, 1);
        return val;
    }

    @Override
    public boolean remove(Object object) {
        int index = indexOf(object);
        if (index >= 0) {
            remove(index);
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected void removeRange(int fromIndex, int toIndex) {
        super.removeRange(fromIndex, toIndex);
        notifyRemove(fromIndex, toIndex - fromIndex);
    }

    @Override
    public void clear() {
        int oldSize = size();
        super.clear();
        if (oldSize != 0) {
            notifyRemove(0, oldSize);
        }
    }

    @Override
    public T set(int index, T object) {
        T val = super.set(index, object);
        if (listChangeRegistry != null) {
            listChangeRegistry.notifyChanged(this, index, 1);
        }
        return val;
    }

    private void notifyAdd(int start, int count) {
        if (listChangeRegistry != null) {
            listChangeRegistry.notifyInserted(this, start, count);
        }
    }

    private void notifyRemove(int start, int count) {
        if (listChangeRegistry != null) {
            listChangeRegistry.notifyRemoved(this, start, count);
        }
    }

    public void reset(Collection<? extends T> collection) {
        super.clear();
        super.addAll(collection);
        if (listChangeRegistry != null) {
            listChangeRegistry.notifyChanged(this);
        }
    }

    public void updateItem(T object) {
        set(indexOf(object), object);
    }

}