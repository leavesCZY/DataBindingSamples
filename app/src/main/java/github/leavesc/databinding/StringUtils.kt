package github.leavesc.databinding

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.Drawable
import android.util.Log
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.databinding.BindingConversion
import java.util.*

/**
 * 作者：leavesC
 * 时间：2020/6/29 22:51
 * 描述：
 * GitHub：https://github.com/leavesC
 * Blog：https://juejin.im/user/57c2ea9befa631005abd00c6
 */

object StringUtils {

    fun toUpperCase(str: String): String {
        return str.toUpperCase(Locale.ROOT)
    }

}

private val TAG = "Main9Activity"

@BindingAdapter("url")
fun loadImage(view: ImageView, url: String) {
    Log.e(TAG, "loadImage url : $url")
}

@BindingConversion
fun convertStringToDrawable(str: String): Drawable {
    if (str == "红色") {
        return ColorDrawable(Color.parseColor("#FF4081"))
    }
    return if (str == "蓝色") {
        ColorDrawable(Color.parseColor("#3F51B5"))
    } else ColorDrawable(Color.parseColor("#344567"))
}

@BindingConversion
fun convertStringToColor(str: String): Int {
    if (str == "红色") {
        return Color.parseColor("#FF4081")
    }
    return if (str == "蓝色") {
        Color.parseColor("#3F51B5")
    } else Color.parseColor("#344567")
}
