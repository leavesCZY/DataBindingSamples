package github.leavesc.databinding

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.ObservableArrayList
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.*

/**
 * 作者：leavesC
 * 时间：2020/6/29 23:06
 * 描述：
 * GitHub：https://github.com/leavesC
 */
class MainActivity13 : AppCompatActivity() {

    private val userObservableArrayList = ObservableArrayList<UserBean>().apply {
        for (i in 0..19) {
            val user = UserBean("user_$i", (Random().nextInt() * 4).toString())
            add(user)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main13)
        val rvList = findViewById<RecyclerView>(R.id.rvList)
        rvList.layoutManager = LinearLayoutManager(this)
        val userAdapter = UserAdapter(userObservableArrayList)
        userAdapter.notifyDataSetChanged()
        userObservableArrayList.addOnListChangedCallback(DynamicChangeCallback<UserBean>(userAdapter))
        rvList.adapter = userAdapter
    }

    fun addItem(view: View) {
        if (userObservableArrayList.size >= 3) {
            val user = UserBean("user_" + 100, (Random().nextInt() * 4).toString())
            userObservableArrayList.add(1, user)
        }
    }

    fun addItemList(view: View) {
        if (userObservableArrayList.size >= 3) {
            val userList: MutableList<UserBean> = ArrayList<UserBean>()
            for (i in 0..2) {
                val user = UserBean("user_" + 100, (Random().nextInt() * 4).toString())
                userList.add(user)
            }
            userObservableArrayList.addAll(1, userList)
        }
    }

    fun removeItem(view: View) {
        if (userObservableArrayList.size >= 3) {
            userObservableArrayList.removeAt(1)
        }
    }

    fun updateItem(view: View) {
        if (userObservableArrayList.size >= 3) {
            val user: UserBean = userObservableArrayList[1]
            user.name = "user_" + Random().nextInt()
            userObservableArrayList[1] = user
        }
    }

}