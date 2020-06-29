package github.leavesc.databindingsamples;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import github.leavesc.databindingsamples.databinding.ActivityMain10Binding;

/**
 * 作者：CZY
 * 时间：2020/6/29 17:03
 * 描述：
 */
public class Main10Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMain10Binding binding = DataBindingUtil.setContentView(this, R.layout.activity_main10);
    }

}
