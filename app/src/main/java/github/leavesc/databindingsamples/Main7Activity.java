package github.leavesc.databindingsamples;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewStub;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import github.leavesc.databindingsamples.databinding.ActivityMain7Binding;
import github.leavesc.databindingsamples.databinding.ViewStubBinding;
import github.leavesc.databindingsamples.model.User;

/**
 * 作者：CZY
 * 时间：2020/6/29 17:06
 * 描述：
 */
public class Main7Activity extends AppCompatActivity {

    private ActivityMain7Binding binding;

    private User user;

    private static final String TAG = "Main7Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main7);
        binding.setHandler(new Handler());
        user = new User("leavesC", "123456");
        binding.setUserInfo(user);
        binding.viewStub.setOnInflateListener(new ViewStub.OnInflateListener() {
            @Override
            public void onInflate(ViewStub stub, View inflated) {
                //如果在 xml 中没有使用 bind:userInfo="@{userInf}" 对 viewStub 进行数据绑定
                //那么可以在此处进行手动绑定
                ViewStubBinding viewStubBinding = DataBindingUtil.bind(inflated);
                viewStubBinding.setUserInfo(user);
                Log.e(TAG, "onInflate");
            }
        });
    }

    public class Handler {

        public void onClick(View v) {
            if (!binding.viewStub.isInflated()) {
                binding.viewStub.getViewStub().inflate();
            }
        }

    }

}
