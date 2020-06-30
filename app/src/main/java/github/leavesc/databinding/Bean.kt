package github.leavesc.databinding

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import androidx.databinding.ObservableField
import androidx.databinding.ObservableFloat

/**
 * 作者：leavesC
 * 时间：2020/6/29 22:26
 * 描述：
 * GitHub：https://github.com/leavesC
 */
data class UserBean(var name: String, var password: String)

class ObservableGoodsBean(name: String, details: String, price: Float) {
    val name: ObservableField<String> = ObservableField(name)
    val details: ObservableField<String> = ObservableField(details)
    val price: ObservableFloat = ObservableFloat(price)
}

class GoodsBean : BaseObservable() {

    @Bindable
    var name = ""
        set(value) {
            field = value
            //只更新本字段
            notifyPropertyChanged(BR.name)
        }

    @Bindable
    var details = ""
        set(value) {
            field = value
            //更新所有字段
            notifyChange()
        }

    var price = 0F

}

class ImageBean(url: String) {

    var url: ObservableField<String> = ObservableField(url)

}