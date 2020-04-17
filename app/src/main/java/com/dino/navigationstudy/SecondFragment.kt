package com.dino.navigationstudy

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_second.*

class SecondFragment : Fragment(R.layout.fragment_second) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_show.setOnClickListener {
            val name = et_name.text.toString()
            val age = et_age.text.toString().toInt()
            val action = SecondFragmentDirections
                .actionSecondFragmentToIntroductionDialogFragment(name, age)
            findNavController().navigate(action)
        }
    }
}