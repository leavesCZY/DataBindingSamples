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
 */

object StringUtils {

    fun toUpperCase(str: String): String {
        return str.toUpperCase(Locale.ROOT)
    }

}