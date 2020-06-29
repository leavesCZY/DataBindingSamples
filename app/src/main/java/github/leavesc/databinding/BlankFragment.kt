package github.leavesc.databinding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import github.leavesc.databinding.databinding.FragmentBlankBinding

/**
 * 作者：leavesC
 * 时间：2020/6/29 23:02
 * 描述：
 * GitHub：https://github.com/leavesC
 * Blog：https://juejin.im/user/57c2ea9befa631005abd00c6
 */
class BlankFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentBlankBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_blank, container, false)
        binding.setHint("Hello")
        return binding.getRoot()
    }

}