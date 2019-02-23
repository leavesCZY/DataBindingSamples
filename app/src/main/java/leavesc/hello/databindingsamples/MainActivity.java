package leavesc.hello.databindingsamples;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void startActivity(Class c) {
        startActivity(new Intent(this, c));
    }

    public void startActivity2(View view) {
        startActivity(Main2Activity.class);
    }

    public void startActivity3(View view) {
        startActivity(Main3Activity.class);
    }

    public void startActivity4(View view) {
        startActivity(Main4Activity.class);
    }

    public void startActivity12(View view) {
        startActivity(Main12Activity.class);
    }

    public void startActivity5(View view) {
        startActivity(Main5Activity.class);
    }

    public void startActivity6(View view) {
        startActivity(Main6Activity.class);
    }

    public void startActivity7(View view) {
        startActivity(Main7Activity.class);
    }

    public void startActivity8(View view) {
        startActivity(Main8Activity.class);
    }

    public void startActivity9(View view) {
        startActivity(Main9Activity.class);
    }

    public void startActivity10(View view) {
        startActivity(Main10Activity.class);
    }

    public void startActivity11(View view) {
        startActivity(Main11Activity.class);
    }

}
