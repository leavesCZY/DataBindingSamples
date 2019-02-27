package leavesc.hello.databindingsamples;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import leavesc.hello.databindingsamples.databinding.FragmentBlankBinding;

/**
 * 作者：leavesC
 * 时间：2019/2/27 21:36
 * 描述：
 * GitHub：https://github.com/leavesC
 * Blog：https://www.jianshu.com/u/9df45b87cfdf
 */
public class BlankFragment extends Fragment {

    public BlankFragment() {

    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        FragmentBlankBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_blank, container, false);
        binding.setHint("Hello");
        return binding.getRoot();
    }

}
