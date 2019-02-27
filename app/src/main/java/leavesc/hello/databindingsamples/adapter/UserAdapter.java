package leavesc.hello.databindingsamples.adapter;

import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

import leavesc.hello.databindingsamples.R;
import leavesc.hello.databindingsamples.databinding.ItemUserBinding;
import leavesc.hello.databindingsamples.model.User;

/**
 * 作者：leavesC
 * 时间：2019/2/27 21:36
 * 描述：
 * GitHub：https://github.com/leavesC
 * Blog：https://www.jianshu.com/u/9df45b87cfdf
 */
public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserAdapterHolder> {

    private List<User> userList;

    public UserAdapter(List<User> userList) {
        this.userList = userList;
    }

    @NonNull
    @Override
    public UserAdapterHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemUserBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.item_user, parent, false);
        return new UserAdapterHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull UserAdapterHolder holder, int position) {
        holder.getBinding().setUser(userList.get(position));
    }

    @Override
    public int getItemCount() {
        if (userList == null) {
            return 0;
        }
        return userList.size();
    }

    class UserAdapterHolder extends RecyclerView.ViewHolder {

        private ItemUserBinding binding;

        UserAdapterHolder(ItemUserBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public ItemUserBinding getBinding() {
            return binding;
        }
    }

}
