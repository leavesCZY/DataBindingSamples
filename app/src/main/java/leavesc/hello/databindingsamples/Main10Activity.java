package leavesc.hello.databindingsamples;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import leavesc.hello.databindingsamples.databinding.ActivityMain10Binding;

public class Main10Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMain10Binding binding = DataBindingUtil.setContentView(this, R.layout.activity_main10);
    }

}
