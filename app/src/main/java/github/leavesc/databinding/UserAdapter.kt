package github.leavesc.databinding

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import github.leavesc.databinding.databinding.ItemUserBinding

/**
 * 作者：leavesC
 * 时间：2020/6/29 23:03
 * 描述：
 * GitHub：https://github.com/leavesC
 */
class UserAdapter(private val userList: List<UserBean>) :
    RecyclerView.Adapter<UserAdapter.UserAdapterHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): UserAdapterHolder {
        val binding: ItemUserBinding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.item_user,
            parent,
            false
        )
        return UserAdapterHolder(binding)
    }

    override fun onBindViewHolder(holder: UserAdapterHolder, position: Int) {
        holder.getBinding().user = userList[position]
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    inner class UserAdapterHolder(private val binding: ItemUserBinding) : ViewHolder(binding.root) {

        fun getBinding(): ItemUserBinding {
            return binding
        }

    }

}
