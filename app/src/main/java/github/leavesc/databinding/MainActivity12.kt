package github.leavesc.databinding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.*

/**
 * 作者：leavesC
 * 时间：2020/6/29 23:03
 * 描述：
 * GitHub：https://github.com/leavesC
 * Blog：https://juejin.im/user/57c2ea9befa631005abd00c6
 */
class MainActivity12 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main12)
        val rvList = findViewById<RecyclerView>(R.id.rvList)
        rvList.layoutManager = LinearLayoutManager(this)
        val userList: MutableList<UserBean> = ArrayList<UserBean>()
        for (i in 0..19) {
            val user = UserBean("user_$i", (Random().nextInt() * 4).toString())
            userList.add(user)
        }
        val userAdapter = UserAdapter(userList)
        rvList.adapter = userAdapter
    }

}