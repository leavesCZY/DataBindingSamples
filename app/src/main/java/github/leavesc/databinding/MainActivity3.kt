package github.leavesc.databinding

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.Observable
import androidx.databinding.Observable.OnPropertyChangedCallback
import github.leavesc.databinding.databinding.ActivityMain3Binding
import java.util.*

/**
 * 作者：leavesC
 * 时间：2020/6/29 22:37
 * 描述：
 * GitHub：https://github.com/leavesC
 * Blog：https://juejin.im/user/57c2ea9befa631005abd00c6
 */
class MainActivity3 : AppCompatActivity() {

    private val TAG = "Main3Activity"

    private lateinit var goods: Goods

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMain3Binding =
            DataBindingUtil.setContentView(this, R.layout.activity_main3)
        goods = Goods()
        goods.name = "code"
        goods.details = "hi"
        goods.price = 24f

        binding.goods = goods
        binding.goodsHandler = GoodsHandler()
        goods.addOnPropertyChangedCallback(object : OnPropertyChangedCallback() {
            override fun onPropertyChanged(
                sender: Observable,
                propertyId: Int
            ) {
                if (propertyId == BR.name) {
                    Log.e(TAG, "BR.name")
                } else if (propertyId == BR.details) {
                    Log.e(TAG, "BR.details")
                } else if (propertyId == BR._all) {
                    Log.e(TAG, "BR._all")
                } else {
                    Log.e(TAG, "未知")
                }
            }
        })
    }

    inner class GoodsHandler {
        fun changeGoodsName() {
            goods.name = "code" + Random().nextInt(100)
            goods.price = Random().nextFloat()
        }

        fun changeGoodsDetails() {
            goods.details = "hi" + Random().nextInt(100)
            goods.price = Random().nextFloat()
        }
    }

}