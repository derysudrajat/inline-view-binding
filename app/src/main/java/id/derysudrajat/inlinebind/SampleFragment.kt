package id.derysudrajat.inlinebind

import android.os.Bundle
import android.view.View
import id.derysudrajat.inlinebind.databinding.FragmentSampleBinding
import id.derysudrajat.inlinebinding.BindingFragment
import id.derysudrajat.inlinebinding.viewBinding

class SampleFragment : BindingFragment<FragmentSampleBinding>() {

    override val binding by viewBinding(FragmentSampleBinding::inflate)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.tvSample.text = buildString { append("This is Sample Fragment") }
    }

}