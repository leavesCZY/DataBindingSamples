package github.leavesc.databindingsamples;

import android.os.Bundle;

import java.util.Random;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import github.leavesc.databindingsamples.model.ObservableGoods;
import github.leavesc.databindingsamples.databinding.ActivityMain4Binding;

/**
 * 作者：CZY
 * 时间：2020/6/29 17:02
 * 描述：
 */
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
