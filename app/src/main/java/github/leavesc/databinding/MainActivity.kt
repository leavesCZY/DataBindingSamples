package github.leavesc.databinding

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

/**
 * 作者：leavesC
 * 时间：2020/6/29 22:18
 * 描述：
 * GitHub：https://github.com/leavesC
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    private fun <T : Activity> startActivity(c: Class<T>) {
        startActivity(Intent(this, c))
    }

    //单向/双向 数据绑定
    fun startActivity2(view: View) {
        startActivity(MainActivity2::class.java)
    }

    //BaseObservable
    fun startActivity3(view: View) {
        startActivity(MainActivity3::class.java)
    }

    //ObservableField
    fun startActivity4(view: View) {
        startActivity(MainActivity4::class.java)
    }

    //ObservableCollection
    fun startActivity5(view: View) {
        startActivity(MainActivity5::class.java)
    }

    //事件绑定
    fun startActivity6(view: View) {
        startActivity(MainActivity6::class.java)
    }

    //viewStub 和 include
    fun startActivity7(view: View) {
        startActivity(MainActivity7::class.java)
    }

    //集合框架
    fun startActivity8(view: View) {
        startActivity(MainActivity8::class.java)
    }

    //BindingAdapter 和 BindingConversion
    fun startActivity9(view: View) {
        startActivity(MainActivity9::class.java)
    }

    //资源引用
    fun startActivity10(view: View) {
        startActivity(MainActivity10::class.java)
    }

    //Fragment
    fun startActivity11(view: View) {
        startActivity(MainActivity11::class.java)
    }

    //RecyclerView
    fun startActivity12(view: View) {
        startActivity(MainActivity12::class.java)
    }

    //ObservableArrayList
    fun startActivity13(view: View) {
        startActivity(MainActivity13::class.java)
    }

}