package com.leavesc.databinding_demo;

import android.databinding.DataBindingUtil;
import android.databinding.Observable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.leavesc.databinding_demo.databinding.ActivityMain3Binding;
import com.leavesc.databinding_demo.model.Goods;

import java.util.Random;

/**
 * 作者：叶应是叶
 * 时间：2018/5/16 21:07
 * 描述：
 */
public class Main3Activity extends AppCompatActivity {

    private Goods goods;

    private ActivityMain3Binding activityMain3Binding;

    private static final String TAG = "Main3Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        activityMain3Binding = DataBindingUtil.setContentView(this, R.layout.activity_main3);
        goods = new Goods("code", "hi", 24);
        activityMain3Binding.setGoods(goods);
        activityMain3Binding.setGoodsHandler(new GoodsHandler());
        goods.addOnPropertyChangedCallback(new Observable.OnPropertyChangedCallback() {
            @Override
            public void onPropertyChanged(Observable sender, int propertyId) {
                if (propertyId == com.leavesc.databinding_demo.BR.name) {
                    Log.e(TAG, "BR.name");
                } else if (propertyId == com.leavesc.databinding_demo.BR.details) {
                    Log.e(TAG, "BR.details");
                } else if (propertyId == com.leavesc.databinding_demo.BR._all) {
                    Log.e(TAG, "BR._all");
                } else {
                    Log.e(TAG, "未知");
                }
            }
        });
    }

    public class GoodsHandler {

        public void changeGoodsName() {
            goods.setName("code" + new Random().nextInt(100));
            goods.setPrice(new Random().nextInt(100));
        }

        public void changeGoodsDetails() {
            goods.setDetails("hi" + new Random().nextInt(100));
            goods.setPrice(new Random().nextInt(100));
        }

    }

}
