package leavesc.hello.databindingsamples;

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

/**
 * 作者：leavesC
 * 时间：2019/2/27 21:36
 * 描述：
 * GitHub：https://github.com/leavesC
 * Blog：https://www.jianshu.com/u/9df45b87cfdf
 */
public class Main12Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main12);
        RecyclerView rvList = findViewById(R.id.rvList);
        rvList.setLayoutManager(new LinearLayoutManager(this));
        List<User> userList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            User user = new User("user_" + i, String.valueOf(new Random().nextInt() * 4));
            userList.add(user);
        }
        UserAdapter userAdapter = new UserAdapter(userList);
        rvList.setAdapter(userAdapter);
    }
}
