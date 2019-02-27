package leavesc.hello.databindingsamples;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.widget.Toast;

import leavesc.hello.databindingsamples.databinding.ActivityMain6Binding;
import leavesc.hello.databindingsamples.model.User;

/**
 * 作者：leavesC
 * 时间：2019/2/27 21:36
 * 描述：
 * GitHub：https://github.com/leavesC
 * Blog：https://www.jianshu.com/u/9df45b87cfdf
 */
public class Main6Activity extends AppCompatActivity {

    private ActivityMain6Binding binding;

    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main6);
        user = new User("leavesC", "12345");
        binding.setUserInfo(user);
        binding.setUserPresenter(new UserPresenter());
    }

    public class UserPresenter {

        public void onUserNameClick(User user) {
            Toast.makeText(Main6Activity.this, "用户名：" + user.getName(), Toast.LENGTH_SHORT).show();
        }

        public void afterTextChanged(Editable s) {
            user.setName(s.toString());
            binding.setUserInfo(user);
        }

        public void afterUserPasswordChanged(Editable s) {
            user.setPassword(s.toString());
            binding.setUserInfo(user);
        }

    }

}
