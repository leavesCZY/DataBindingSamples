package github.leavesc.databindingsamples;

import android.os.Bundle;
import android.util.Log;

import java.util.Random;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.Observable;
import github.leavesc.databindingsamples.model.Goods;
import github.leavesc.databindingsamples.databinding.ActivityMain3Binding;

/**
 * 作者：CZY
 * 时间：2020/6/29 17:01
 * 描述：
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
                if (propertyId == leavesc.hello.databindingsamples.BR.name) {
                    Log.e(TAG, "BR.name");
                } else if (propertyId == leavesc.hello.databindingsamples.BR.details) {
                    Log.e(TAG, "BR.details");
                } else if (propertyId == leavesc.hello.databindingsamples.BR._all) {
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
