package leavesc.hello.databindingsamples;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.Random;

import leavesc.hello.databindingsamples.databinding.ActivityMain4Binding;
import leavesc.hello.databindingsamples.model.ObservableGoods;

public class Main4Activity extends AppCompatActivity {

    private ObservableGoods observableGoods;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMain4Binding binding = DataBindingUtil.setContentView(this, R.layout.activity_main4);
        observableGoods = new ObservableGoods("code", "hello", 25);
        binding.setObservableGoods(observableGoods);
        binding.setObservableGoodsHandler(new ObservableGoodsHandler());
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
