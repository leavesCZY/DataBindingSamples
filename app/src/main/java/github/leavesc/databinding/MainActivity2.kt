package github.leavesc.databinding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import github.leavesc.databinding.databinding.ActivityMain2Binding

/**
 * 作者：leavesC
 * 时间：2020/6/29 22:20
 * 描述：
 * GitHub：https://github.com/leavesC
 * Blog：https://www.jianshu.com/u/9df45b87cfdf
 */
class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMain2Binding =
            DataBindingUtil.setContentView(this, R.layout.activity_main2)
        val user = UserBean("leavesC", "123456")
        binding.userInfo = user
        val goods = ObservableGoods("code", "hi", 23F)
        binding.goods = goods
    }

}