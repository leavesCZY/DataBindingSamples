package com.leavesc.databinding_demo;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.leavesc.databinding_demo.databinding.FragmentBlankBinding;

/**
 * 作者：叶应是叶
 * 时间：2018/5/20 18:47
 * 描述：
 */
public class BlankFragment extends Fragment {

    public BlankFragment() {

    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        FragmentBlankBinding fragmentBlankBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_blank, container, false);
        fragmentBlankBinding.setHint("Hello");
        return fragmentBlankBinding.getRoot();
    }

}
