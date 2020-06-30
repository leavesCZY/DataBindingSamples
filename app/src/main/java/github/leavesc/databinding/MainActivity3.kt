package github.leavesc.databinding

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.Observable
import androidx.databinding.Observable.OnPropertyChangedCallback
import github.leavesc.databinding.databinding.ActivityMain3Binding
import kotlin.random.Random

/**
 * 作者：leavesC
 * 时间：2020/6/29 22:37
 * 描述：
 * GitHub：https://github.com/leavesC
 */
class MainActivity3 : AppCompatActivity() {

    private val TAG = "Main3Activity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMain3Binding =
            DataBindingUtil.setContentView(this, R.layout.activity_main3)

        val goods = GoodsBean()
        goods.name = "code"
        goods.details = "hi"
        goods.price = 24f

        binding.goods = goods
        binding.goodsHandler = GoodsHandler(goods)

        goods.addOnPropertyChangedCallback(object : OnPropertyChangedCallback() {
            override fun onPropertyChanged(sender: Observable, propertyId: Int) {
                when (propertyId) {
                    BR.name -> {
                        Log.e(TAG, "BR.name")
                    }
                    BR.details -> {
                        Log.e(TAG, "BR.details")
                    }
                    BR._all -> {
                        Log.e(TAG, "BR._all")
                    }
                    else -> {
                        Log.e(TAG, "未知")
                    }
                }
            }
        })
    }

    class GoodsHandler(private val goodsBean: GoodsBean) {

        fun changeGoodsName() {
            goodsBean.price = Random.nextFloat()
            goodsBean.name = "code" + Random.nextInt(100)
        }

        fun changeGoodsDetails() {
            goodsBean.price = Random.nextFloat()
            goodsBean.details = "hi" + Random.nextInt(100)
        }
    }

}