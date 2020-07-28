package github.leavesc.databinding.common

import android.widget.Toast
import github.leavesc.databinding.App

/**
 * Author : Zmj
 * Blog : https://blog.csdn.net/Zmj_Dns
 * GitHub : https://github.com/ZmjDns
 * Time : 2020/7/28
 * Description :
 */

fun showToast(msg: String){
    Toast.makeText(App.getAppContext(),msg,Toast.LENGTH_SHORT).show()
}