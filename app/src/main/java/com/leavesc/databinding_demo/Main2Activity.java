package com.leavesc.databinding_demo;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.leavesc.databinding_demo.databinding.ActivityMain2Binding;
import com.leavesc.databinding_demo.model.User;

/**
 * 作者：叶应是叶
 * 时间：2018/5/16 20:22
 * 描述：
 */
public class Main2Activity extends AppCompatActivity {

    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMain2Binding activityMain2Binding = DataBindingUtil.setContentView(this, R.layout.activity_main2);
        user = new User("leavesC", "123456");
        activityMain2Binding.setUserInfo(user);
    }

}
