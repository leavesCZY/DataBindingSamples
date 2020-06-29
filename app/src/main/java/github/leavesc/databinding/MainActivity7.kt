package github.leavesc.databinding

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import github.leavesc.databinding.databinding.ActivityMain7Binding
import github.leavesc.databinding.databinding.ViewStubBinding

/**
 * 作者：leavesC
 * 时间：2020/6/29 22:55
 * 描述：
 * GitHub：https://github.com/leavesC
 * Blog：https://juejin.im/user/57c2ea9befa631005abd00c6
 */
class MainActivity7 : AppCompatActivity() {

    private lateinit var binding: ActivityMain7Binding

    private lateinit var user: UserBean

    private val TAG = "Main7Activity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main7)
        binding.setHandler(Handler())
        user = UserBean("leavesC", "123456")
        binding.userInfo = user
        binding.viewStub.setOnInflateListener { _, inflated -> //如果在 xml 中没有使用 bind:userInfo="@{userInf}" 对 viewStub 进行数据绑定
            //那么可以在此处进行手动绑定
            val viewStubBinding: ViewStubBinding = DataBindingUtil.bind(inflated)!!
            viewStubBinding.userInfo = user
            Log.e(TAG, "onInflate")
        }
    }

    inner class Handler {
        fun onClick(v: View) {
            if (!binding.viewStub.isInflated) {
                binding.viewStub.viewStub!!.inflate()
            }
        }
    }

}