package github.leavesc.databinding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import github.leavesc.databinding.databinding.ActivityMain4Binding
import java.util.*

/**
 * 作者：leavesC
 * 时间：2020/6/29 22:47
 * 描述：
 * GitHub：https://github.com/leavesC
 * Blog：https://juejin.im/user/57c2ea9befa631005abd00c6
 */
class MainActivity4 : AppCompatActivity() {

    private lateinit var observableGoods: ObservableGoods

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMain4Binding =
            DataBindingUtil.setContentView(this, R.layout.activity_main4)
        observableGoods = ObservableGoods("code", "hello", 25F)
        binding.observableGoods = observableGoods
        binding.observableGoodsHandler = ObservableGoodsHandler()
    }

    inner class ObservableGoodsHandler {
        fun changeGoodsName() {
            observableGoods.name.set("code" + Random().nextInt(100))
        }

        fun changeGoodsDetails() {
            observableGoods.details.set("hi" + Random().nextInt(100))
        }
    }

}