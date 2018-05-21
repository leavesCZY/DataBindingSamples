package com.leavesc.databinding_demo;

import android.databinding.BindingAdapter;
import android.databinding.BindingConversion;
import android.databinding.DataBindingUtil;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;

import com.leavesc.databinding_demo.databinding.ActivityMain8Binding;
import com.leavesc.databinding_demo.model.Image;

import java.util.Random;

/**
 * 作者：叶应是叶
 * 时间：2018/5/20 14:10
 * 描述：
 */
public class Main8Activity extends AppCompatActivity {

    private static final String TAG = "Main8Activity";

    private ActivityMain8Binding activityMain8Binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMain8Binding = DataBindingUtil.setContentView(this, R.layout.activity_main8);
        activityMain8Binding.setImage(new Image("xxxxxxx"));
        activityMain8Binding.setHandler(new Handler());
    }

    public class Handler {

        public void onClick(Image image) {
            image.getUrl().set("xxxxx" + new Random().nextInt(1000));
        }

    }

    @BindingAdapter({"url"})
    public static void loadImage(ImageView view, String url) {
        Log.e(TAG, "loadImage url : " + url);
    }

//    @BindingAdapter("android:text")
//    public static void setText(Button view, String text) {
//        view.setText(text + "-Button");
//    }
//
//    @BindingConversion
//    public static String conversionString(String text) {
//        return text + "-conversionString";
//    }

    @BindingConversion
    public static Drawable convertStringToDrawable(String str) {
        if (str.equals("红色")) {
            return new ColorDrawable(Color.parseColor("#FF4081"));
        }
        if (str.equals("蓝色")) {
            return new ColorDrawable(Color.parseColor("#3F51B5"));
        }
        return new ColorDrawable(Color.parseColor("#344567"));
    }

    @BindingConversion
    public static int convertStringToColor(String str) {
        if (str.equals("红色")) {
            return Color.parseColor("#FF4081");
        }
        if (str.equals("蓝色")) {
            return Color.parseColor("#3F51B5");
        }
        return Color.parseColor("#344567");
    }

}