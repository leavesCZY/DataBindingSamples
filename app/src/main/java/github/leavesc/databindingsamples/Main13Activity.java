package github.leavesc.databindingsamples;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.ObservableArrayList;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import github.leavesc.databindingsamples.adapter.UserAdapter;
import github.leavesc.databindingsamples.model.User;
import github.leavesc.databindingsamples.observable.DynamicChangeCallback;

/**
 * 作者：CZY
 * 时间：2020/6/29 17:02
 * 描述：
 */
public class Main13Activity extends AppCompatActivity {

    private ObservableArrayList<User> userObservableArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main13);
        RecyclerView rvList = findViewById(R.id.rvList);
        rvList.setLayoutManager(new LinearLayoutManager(this));
        initData();
        UserAdapter userAdapter = new UserAdapter(userObservableArrayList);
        userAdapter.notifyDataSetChanged();
        userObservableArrayList.addOnListChangedCallback(new DynamicChangeCallback(userAdapter));
        rvList.setAdapter(userAdapter);
    }

    private void initData() {
        userObservableArrayList = new ObservableArrayList<>();
        for (int i = 0; i < 20; i++) {
            User user = new User("user_" + i, String.valueOf(new Random().nextInt() * 4));
            userObservableArrayList.add(user);
        }
    }

    public void addItem(View view) {
        if (userObservableArrayList.size() >= 3) {
            User user = new User("user_" + 100, String.valueOf(new Random().nextInt() * 4));
            userObservableArrayList.add(1, user);
        }
    }

    public void addItemList(View view) {
        if (userObservableArrayList.size() >= 3) {
            List<User> userList = new ArrayList<>();
            for (int i = 0; i < 3; i++) {
                User user = new User("user_" + 100, String.valueOf(new Random().nextInt() * 4));
                userList.add(user);
            }
            userObservableArrayList.addAll(1, userList);
        }
    }

    public void removeItem(View view) {
        if (userObservableArrayList.size() >= 3) {
            userObservableArrayList.remove(1);
        }
    }

    public void updateItem(View view) {
        if (userObservableArrayList.size() >= 3) {
            User user = userObservableArrayList.get(1);
            user.setName("user_" + new Random().nextInt());
            userObservableArrayList.set(1, user);
        }
    }

}