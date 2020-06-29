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
 * Blog：https://juejin.im/user/57c2ea9befa631005abd00c6
 */
data class UserBean(var name: String, var password: String)

class ObservableGoods(name: String, details: String, price: Float) {
    val name: ObservableField<String> = ObservableField(name)
    val details: ObservableField<String> = ObservableField(details)
    val price: ObservableFloat = ObservableFloat(price)

}

//如果是 public 修饰符，则可以直接在成员变量上方加上 @Bindable 注解
//如果是 private 修饰符，则在成员变量的 get 方法上添加 @Bindable 注解
class Goods : BaseObservable() {

    @Bindable
    var name = ""
        set(value) {
            field = value
            //只更新本字段
            notifyPropertyChanged(BR.name)
        }

    @set:Bindable
    var details = ""
        set(value) {
            field = value
            //更新所有字段
            notifyChange()
        }

    var price = 0F

}

class Image(url: String) {

    var url: ObservableField<String> = ObservableField(url)

}