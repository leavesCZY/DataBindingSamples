package com.leavesc.databinding_demo;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.leavesc.databinding_demo.databinding.ActivityMain6Binding;
import com.leavesc.databinding_demo.model.User;

/**
 * 作者：叶应是叶
 * 时间：2018/5/19 10:51
 * 描述：
 */
public class Main6Activity extends AppCompatActivity {

    private ActivityMain6Binding activityMain6Binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMain6Binding = DataBindingUtil.setContentView(this, R.layout.activity_main6);
        activityMain6Binding.setHandler(new Handler());
        activityMain6Binding.setUserInfo(new User("leavesC", "123456"));
    }

    public class Handler {

        public void onClick(View v) {
            View view = activityMain6Binding.viewStub.getViewStub().inflate();
            view.setVisibility(View.VISIBLE);
        }

    }

}
