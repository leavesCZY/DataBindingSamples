package github.leavesc.databinding.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import github.leavesc.databinding.UserBean
import github.leavesc.databinding.common.showToast
import github.leavesc.databinding.databinding.ItemUserBinding

/**
 * Author : Zmj
 * Blog : https://blog.csdn.net/Zmj_Dns
 * GitHub : https://github.com/ZmjDns
 * Time : 2020/7/28
 * Description :
 */
class L12RecyclerAdapter(private val mData: ArrayList<UserBean>): RecyclerView.Adapter<L12RecyclerAdapter.UserItemHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserItemHolder {

        return UserItemHolder(ItemUserBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun getItemCount(): Int {
        return mData.size
    }

    override fun onBindViewHolder(holder: UserItemHolder, position: Int) {
        holder.bindItem(mData[position])
    }


    inner class UserItemHolder(val itemBinding: ItemUserBinding): RecyclerView.ViewHolder(itemBinding.root){
        init {
            itemBinding.setOnCLick {
                itemBinding.user?.let {user ->
                    doSomeThing(user,it)
                }
            }
        }

        fun bindItem(userItem: UserBean){
            itemBinding.apply {
                user = userItem
                executePendingBindings()
            }
        }

        private fun doSomeThing(user: UserBean, it: View) {
            Log.e("L12RecyclerAdapter","U clicked ${user.name}")
            showToast("U clicked ${user.name}")
        }
    }
}