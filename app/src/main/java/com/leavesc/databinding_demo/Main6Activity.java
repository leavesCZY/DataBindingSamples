package com.leavesc.databinding_demo;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.ViewStub;

import com.leavesc.databinding_demo.databinding.ActivityMain6Binding;
import com.leavesc.databinding_demo.databinding.ViewStubBinding;
import com.leavesc.databinding_demo.model.User;

/**
 * 作者：叶应是叶
 * 时间：2018/5/19 10:51
 * 描述：
 */
public class Main6Activity extends AppCompatActivity {

    private ActivityMain6Binding activityMain6Binding;

    private User user;

    private static final String TAG = "Main6Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMain6Binding = DataBindingUtil.setContentView(this, R.layout.activity_main6);
        activityMain6Binding.setHandler(new Handler());
        user = new User("leavesC", "123456");
        activityMain6Binding.setUserInfo(user);
        activityMain6Binding.viewStub.setOnInflateListener(new ViewStub.OnInflateListener() {
            @Override
            public void onInflate(ViewStub stub, View inflated) {
                //如果在 xml 中没有使用 bind:userInfo="@{userInf}" 对 viewStub 进行数据绑定
                //那么可以在此处进行手动绑定
                ViewStubBinding viewStubBinding = DataBindingUtil.bind(inflated);
                viewStubBinding.setUserInfo(user);
                Log.e(TAG, "onInflate");
            }
        });
    }

    public class Handler {

        public void onClick(View v) {
            if (!activityMain6Binding.viewStub.isInflated()) {
                activityMain6Binding.viewStub.getViewStub().inflate();
            }
        }

    }

}
