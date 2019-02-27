package leavesc.hello.databindingsamples;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * 作者：leavesC
 * 时间：2019/2/27 21:36
 * 描述：
 * GitHub：https://github.com/leavesC
 * Blog：https://www.jianshu.com/u/9df45b87cfdf
 */
public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
    }

    private void startActivity(Class c) {
        startActivity(new Intent(this, c));
    }

    //单向/双向 数据绑定
    public void startActivity2(View view) {
        startActivity(Main2Activity.class);
    }

    //BaseObservable
    public void startActivity3(View view) {
        startActivity(Main3Activity.class);
    }

    //ObservableField
    public void startActivity4(View view) {
        startActivity(Main4Activity.class);
    }

    //ObservableCollection
    public void startActivity5(View view) {
        startActivity(Main5Activity.class);
    }

    //事件绑定
    public void startActivity6(View view) {
        startActivity(Main6Activity.class);
    }

    //viewStub 和 include
    public void startActivity7(View view) {
        startActivity(Main7Activity.class);
    }

    //集合框架
    public void startActivity8(View view) {
        startActivity(Main8Activity.class);
    }

    //BindingAdapter 和 BindingConversion
    public void startActivity9(View view) {
        startActivity(Main9Activity.class);
    }

    //资源引用
    public void startActivity10(View view) {
        startActivity(Main10Activity.class);
    }

    //Fragment
    public void startActivity11(View view) {
        startActivity(Main11Activity.class);
    }

    //RecyclerView
    public void startActivity12(View view) {
        startActivity(Main12Activity.class);
    }

    //ObservableArrayList
    public void startActivity13(View view) {
        startActivity(Main13Activity.class);
    }

}