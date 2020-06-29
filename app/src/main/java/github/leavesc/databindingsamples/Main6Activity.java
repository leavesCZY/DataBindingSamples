package github.leavesc.databindingsamples;

import android.os.Bundle;
import android.text.Editable;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import github.leavesc.databindingsamples.databinding.ActivityMain6Binding;
import github.leavesc.databindingsamples.model.User;

/**
 * 作者：CZY
 * 时间：2020/6/29 17:06
 * 描述：
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
        binding.setUserPresenter(new UserPresenter(user, binding));
    }

    public class UserPresenter {

        private User user;

        private ActivityMain6Binding binding;

        public UserPresenter(User user, ActivityMain6Binding binding) {
            this.user = user;
            this.binding = binding;
        }

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
