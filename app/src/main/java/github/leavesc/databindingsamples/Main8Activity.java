package github.leavesc.databindingsamples;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import github.leavesc.databindingsamples.databinding.ActivityMain8Binding;

/**
 * 作者：CZY
 * 时间：2020/6/29 17:03
 * 描述：
 */
public class Main8Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMain8Binding binding = DataBindingUtil.setContentView(this, R.layout.activity_main8);
        binding.setList(new ArrayList<String>());
        Map<String, String> map = new HashMap<>();
        map.put("leavesC", "Hi");
        binding.setMap(map);
        binding.setKey("leavesC");
        Set<String> set = new HashSet<>();
        set.add("xxx");
        binding.setSet(set);
        binding.setArray(new String[]{"Hi", "hello"});
    }

}