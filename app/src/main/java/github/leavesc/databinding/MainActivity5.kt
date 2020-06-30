package github.leavesc.databinding

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ObservableArrayList
import androidx.databinding.ObservableArrayMap
import github.leavesc.databinding.databinding.ActivityMain5Binding
import kotlin.random.Random

/**
 * 作者：leavesC
 * 时间：2020/6/29 22:49
 * 描述：
 * GitHub：https://github.com/leavesC
 */
class MainActivity5 : AppCompatActivity() {

    private val map = ObservableArrayMap<String, String>().apply {
        put("name", "leavesC")
        put("age", "24")
    }

    private val list = ObservableArrayList<String>().apply {
        add("Ye")
        add("leavesC")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMain5Binding =
            DataBindingUtil.setContentView(this, R.layout.activity_main5)
        binding.map = map
        binding.list = list
        binding.index = 0
        binding.key = "name"
    }

    fun onClick(view: View) {
        map["name"] = "leavesC," + Random.nextInt(100)
    }

}