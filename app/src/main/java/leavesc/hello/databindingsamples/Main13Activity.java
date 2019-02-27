package leavesc.hello.databindingsamples;

import android.databinding.ObservableArrayList;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import leavesc.hello.databindingsamples.adapter.UserAdapter;
import leavesc.hello.databindingsamples.model.User;
import leavesc.hello.databindingsamples.observable.DynamicChangeCallback;

/**
 * 作者：leavesC
 * 时间：2019/2/27 21:36
 * 描述：
 * GitHub：https://github.com/leavesC
 * Blog：https://www.jianshu.com/u/9df45b87cfdf
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