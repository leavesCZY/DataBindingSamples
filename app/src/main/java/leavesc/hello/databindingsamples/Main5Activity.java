package leavesc.hello.databindingsamples;

import android.databinding.DataBindingUtil;
import android.databinding.ObservableArrayList;
import android.databinding.ObservableArrayMap;
import android.databinding.ObservableList;
import android.databinding.ObservableMap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import java.util.Random;

import leavesc.hello.databindingsamples.databinding.ActivityMain5Binding;

/**
 * 作者：leavesC
 * 时间：2019/2/27 21:36
 * 描述：
 * GitHub：https://github.com/leavesC
 * Blog：https://www.jianshu.com/u/9df45b87cfdf
 */
public class Main5Activity extends AppCompatActivity {

    private ObservableMap<String, String> map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMain5Binding binding = DataBindingUtil.setContentView(this, R.layout.activity_main5);
        map = new ObservableArrayMap<>();
        map.put("name", "leavesC");
        map.put("age", "24");
        binding.setMap(map);
        ObservableList<String> list = new ObservableArrayList<>();
        list.add("Ye");
        list.add("leavesC");
        binding.setList(list);
        binding.setIndex(0);
        binding.setKey("name");
    }

    public void onClick(View view) {
        map.put("name", "leavesC,hi" + new Random().nextInt(100));
    }

}
