package com.leavesc.databinding_demo;

import android.databinding.DataBindingUtil;
import android.databinding.ObservableArrayList;
import android.databinding.ObservableArrayMap;
import android.databinding.ObservableList;
import android.databinding.ObservableMap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.leavesc.databinding_demo.databinding.ActivityMain12Binding;

import java.util.Random;

/**
 * 作者：叶应是叶
 * 时间：2018/5/21 21:32
 * 描述：
 */
public class Main12Activity extends AppCompatActivity {

    private ObservableMap<String, String> map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMain12Binding activityMain12Binding = DataBindingUtil.setContentView(this, R.layout.activity_main12);
        map = new ObservableArrayMap<>();
        map.put("name", "leavesC");
        map.put("age", "24");
        activityMain12Binding.setMap(map);
        ObservableList<String> list = new ObservableArrayList<>();
        list.add("Ye");
        list.add("leavesC");
        activityMain12Binding.setList(list);
        activityMain12Binding.setIndex(0);
        activityMain12Binding.setKey("name");
    }

    public void onClick(View view) {
        map.put("name", "leavesC,hi" + new Random().nextInt(100));
    }

}
