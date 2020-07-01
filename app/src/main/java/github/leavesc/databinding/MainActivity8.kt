package github.leavesc.databinding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import github.leavesc.databinding.databinding.ActivityMain8Binding
import java.util.*

/**
 * 作者：leavesC
 * 时间：2020/6/29 22:58
 * 描述：
 * GitHub：https://github.com/leavesC
 */
class MainActivity8 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMain8Binding =
            DataBindingUtil.setContentView(this, R.layout.activity_main8)
        binding.list = ArrayList()
        val map = mutableMapOf<String, String>()
        map["leavesC"] = "Hi"
        val set = mutableSetOf<String>()
        set.add("xxx")
        binding.map = map
        binding.key = "leavesC"
        binding.set = set
        binding.array = arrayOf("Hi", "hello")
    }

}