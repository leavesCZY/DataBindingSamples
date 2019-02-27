package leavesc.hello.databindingsamples;

import android.databinding.DataBindingUtil;
import android.databinding.Observable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.util.Random;

import leavesc.hello.databindingsamples.databinding.ActivityMain3Binding;
import leavesc.hello.databindingsamples.model.Goods;

/**
 * 作者：leavesC
 * 时间：2019/2/27 21:36
 * 描述：
 * GitHub：https://github.com/leavesC
 * Blog：https://www.jianshu.com/u/9df45b87cfdf
 */
public class Main3Activity extends AppCompatActivity {

    private static final String TAG = "Main3Activity";

    private Goods goods;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMain3Binding binding = DataBindingUtil.setContentView(this, R.layout.activity_main3);
        goods = new Goods("code", "hi", 24);
        binding.setGoods(goods);
        binding.setGoodsHandler(new GoodsHandler());
        goods.addOnPropertyChangedCallback(new Observable.OnPropertyChangedCallback() {
            @Override
            public void onPropertyChanged(Observable sender, int propertyId) {
                if (propertyId == BR.name) {
                    Log.e(TAG, "BR.name");
                } else if (propertyId == BR.details) {
                    Log.e(TAG, "BR.details");
                } else if (propertyId == BR._all) {
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
