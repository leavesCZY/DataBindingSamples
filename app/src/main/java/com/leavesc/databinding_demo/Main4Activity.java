package com.leavesc.databinding_demo;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.leavesc.databinding_demo.databinding.ActivityMain4Binding;
import com.leavesc.databinding_demo.model.ObservableGoods;

import java.util.Random;

/**
 * 作者：叶应是叶
 * 时间：2018/5/16 22:15
 * 描述：
 */
public class Main4Activity extends AppCompatActivity {

    private ObservableGoods observableGoods;

    private ActivityMain4Binding activityMain4Binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        activityMain4Binding = DataBindingUtil.setContentView(this, R.layout.activity_main4);
        observableGoods = new ObservableGoods("code", "hello", 25);
        activityMain4Binding.setObservableGoods(observableGoods);
        activityMain4Binding.setObservableGoodsHandler(new ObservableGoodsHandler());
    }

    public class ObservableGoodsHandler {

        public void changeGoodsName() {
            observableGoods.getName().set("code" + new Random().nextInt(100));
        }

        public void changeGoodsDetails() {
            observableGoods.getDetails().set("hi" + new Random().nextInt(100));
        }

    }

}
