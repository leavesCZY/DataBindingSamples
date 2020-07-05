package github.leavesc.databinding

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.BindingAdapter
import androidx.databinding.BindingConversion
import androidx.databinding.DataBindingUtil
import github.leavesc.databinding.databinding.ActivityMain9Binding
import kotlin.random.Random

/**
 * 作者：leavesC
 * 时间：2020/6/29 23:00
 * 描述：
 * GitHub：https://github.com/leavesC
 */
class MainActivity9 : AppCompatActivity() {


    companion object {

        const val TAG = "Main9Activity"

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMain9Binding =
            DataBindingUtil.setContentView(this, R.layout.activity_main9)
        binding.setImage(ImageBean("xxxxxxx"))
        binding.handler = Handler()
    }

    class Handler {

        fun onClick(imageBean: ImageBean): Boolean {
            imageBean.url.set("xxxxx" + Random.nextInt(1000))
            return true
        }

    }

}

@BindingAdapter("url")
fun loadImage(view: ImageView, url: String) {
    Log.e(MainActivity9.TAG, "loadImage url : $url")
}

//@BindingAdapter("android:text")
//fun setText(view: Button, text: String) {
//    view.text = "$text-Button"
//}
//
//@BindingConversion
//fun conversionString(text: String): String? {
//    return "$text-conversionString"
//}

@BindingConversion
fun convertStringToDrawable(str: String): Drawable {
    return when (str) {
        "红色" -> {
            ColorDrawable(Color.parseColor("#FF4081"))
        }
        "蓝色" -> {
            ColorDrawable(Color.parseColor("#3F51B5"))
        }
        else -> {
            ColorDrawable(Color.parseColor("#344567"))
        }
    }
}

@BindingConversion
fun convertStringToColor(str: String): Int {
    return when (str) {
        "红色" -> {
            Color.parseColor("#FF4081")
        }
        "蓝色" -> {
            Color.parseColor("#3F51B5")
        }
        else -> {
            Color.parseColor("#344567")
        }
    }
}