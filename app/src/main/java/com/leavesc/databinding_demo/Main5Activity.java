package com.leavesc.databinding_demo;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.widget.Toast;

import com.leavesc.databinding_demo.databinding.ActivityMain5Binding;
import com.leavesc.databinding_demo.model.User;

/**
 * 作者：叶应是叶
 * 时间：2018/5/16 22:32
 * 描述：
 */
public class Main5Activity extends AppCompatActivity {

    private ActivityMain5Binding activityMain5Binding;

    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMain5Binding = DataBindingUtil.setContentView(this, R.layout.activity_main5);
        user = new User("leavesC", "12345");
        activityMain5Binding.setUserInfo(user);
        activityMain5Binding.setUserPresenter(new UserPresenter());
    }

    public class UserPresenter {

        public void onUserNameClick(User user) {
            Toast.makeText(Main5Activity.this, "用户名：" + user.getName(), Toast.LENGTH_SHORT).show();
        }

        public void afterTextChanged(Editable s) {
            user.setName(s.toString());
            activityMain5Binding.setUserInfo(user);
        }

        public void afterUserPasswordChanged(Editable s) {
            user.setPassword(s.toString());
            activityMain5Binding.setUserInfo(user);
        }

    }

}
