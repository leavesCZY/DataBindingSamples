package github.leavesc.databinding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import github.leavesc.databinding.databinding.ActivityMain10Binding

/**
 * 作者：leavesC
 * 时间：2020/6/29 23:00
 * 描述：
 * GitHub：https://github.com/leavesC
 */
class MainActivity10 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMain10Binding =
            DataBindingUtil.setContentView(this, R.layout.activity_main10)
    }

}