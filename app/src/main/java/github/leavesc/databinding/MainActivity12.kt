package github.leavesc.databinding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import github.leavesc.databinding.adapter.L12RecyclerAdapter
import github.leavesc.databinding.databinding.ActivityMain12Binding
import java.util.*
import kotlin.random.Random

/**
 * 作者：leavesC
 * 时间：2020/6/29 23:03
 * 描述：
 * GitHub：https://github.com/leavesC
 */
class MainActivity12 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /*setContentView(R.layout.activity_main12)
        val rvList = findViewById<RecyclerView>(R.id.rvList)
        val userList = mutableListOf<UserBean>()
        for (i in 0..19) {
            val user = UserBean("user_$i", (Random().nextInt() * 4).toString())
            userList.add(user)
        }
        val userAdapter = UserAdapter(userList)
        rvList.layoutManager = LinearLayoutManager(this)
        rvList.adapter = userAdapter*/

        val binding: ActivityMain12Binding = DataBindingUtil.setContentView(this,R.layout.activity_main12)

        val mData = ArrayList<UserBean>().apply {
            for(i in 0 until 20){
                add(UserBean("ZMJname$i","ZMJPass${Random.nextInt(1000)}"))
            }
        }

        binding.rvList.adapter = L12RecyclerAdapter(mData)
    }

}