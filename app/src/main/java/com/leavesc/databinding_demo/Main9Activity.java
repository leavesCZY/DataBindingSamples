package com.leavesc.databinding_demo;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.leavesc.databinding_demo.databinding.ActivityMain9Binding;

/**
 * 作者：叶应是叶
 * 时间：2018/5/20 18:00
 * 描述：
 */
public class Main9Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMain9Binding activityMain9Binding = DataBindingUtil.setContentView(this, R.layout.activity_main9);
    }

}
