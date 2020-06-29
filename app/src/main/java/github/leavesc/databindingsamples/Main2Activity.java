package github.leavesc.databindingsamples;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import github.leavesc.databindingsamples.model.ObservableGoods;
import github.leavesc.databindingsamples.model.User;
import github.leavesc.databindingsamples.databinding.ActivityMain2Binding;

/**
 * 作者：CZY
 * 时间：2020/6/29 17:01
 * 描述：
 */
public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMain2Binding binding = DataBindingUtil.setContentView(this, R.layout.activity_main2);

        User user = new User("leavesC", "123456");
        binding.setUserInfo(user);

        ObservableGoods goods = new ObservableGoods("code", "hi", 23);
        binding.setGoods(goods);

    }

}
