package github.leavesc.databindingsamples;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import github.leavesc.databindingsamples.adapter.UserAdapter;
import github.leavesc.databindingsamples.model.User;

/**
 * 作者：CZY
 * 时间：2020/6/29 17:02
 * 描述：
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
