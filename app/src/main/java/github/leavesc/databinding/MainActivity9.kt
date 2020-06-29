package github.leavesc.databinding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import github.leavesc.databinding.databinding.ActivityMain9Binding
import java.util.*

/**
 * 作者：leavesC
 * 时间：2020/6/29 23:00
 * 描述：
 * GitHub：https://github.com/leavesC
 * Blog：https://juejin.im/user/57c2ea9befa631005abd00c6
 */
class MainActivity9 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMain9Binding =
            DataBindingUtil.setContentView(this, R.layout.activity_main9)
        binding.setImage(Image("xxxxxxx"))
        binding.handler = Handler()
    }

    class Handler {
        fun onClick(image: Image): Boolean {
            image.url.set("xxxxx" + Random().nextInt(1000))
            return true
        }
    }

}