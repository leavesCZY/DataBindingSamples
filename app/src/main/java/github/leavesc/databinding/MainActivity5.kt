package github.leavesc.databinding

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.*
import github.leavesc.databinding.databinding.ActivityMain5Binding
import java.util.*

/**
 * 作者：leavesC
 * 时间：2020/6/29 22:49
 * 描述：
 * GitHub：https://github.com/leavesC
 * Blog：https://juejin.im/user/57c2ea9befa631005abd00c6
 */
class MainActivity5 : AppCompatActivity() {

    private lateinit var map: ObservableMap<String, String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMain5Binding =
            DataBindingUtil.setContentView(this, R.layout.activity_main5)
        map = ObservableArrayMap()
        map["name"] = "leavesC"
        map["age"] = "24"
        binding.map = map
        val list: ObservableList<String> = ObservableArrayList()
        list.add("Ye")
        list.add("leavesC")
        binding.list = list
        binding.index = 0
        binding.key = "name"
    }

    fun onClick(view: View) {
        map["name"] = "leavesC,hi" + Random().nextInt(100)
    }
}