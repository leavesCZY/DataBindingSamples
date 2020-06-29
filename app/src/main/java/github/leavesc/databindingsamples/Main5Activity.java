package github.leavesc.databindingsamples;

import android.os.Bundle;
import android.view.View;

import java.util.Random;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableArrayMap;
import androidx.databinding.ObservableList;
import androidx.databinding.ObservableMap;
import github.leavesc.databindingsamples.databinding.ActivityMain5Binding;

/**
 * 作者：CZY
 * 时间：2020/6/29 17:06
 * 描述：
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
