package com.leavesc.databinding_demo;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.leavesc.databinding_demo.databinding.ActivityMain10Binding;
import com.leavesc.databinding_demo.model.ObservableGoods;

/**
 * 作者：叶应是叶
 * 时间：2018/5/20 19:51
 * 描述：
 */
public class Main10Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMain10Binding activityMain10Binding = DataBindingUtil.setContentView(this, R.layout.activity_main10);
        ObservableGoods goods = new ObservableGoods("code", "hi", 23);
        activityMain10Binding.setGoods(goods);
    }

}
