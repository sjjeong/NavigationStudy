package com.dino.navigationstudy

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_main.view.*

class MainFragment : Fragment(R.layout.fragment_main){

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.btn_move.setOnClickListener {
            val action = MainFragmentDirections.actionMainFragmentToSecondFragment()
            findNavController().navigate(action)
        }
    }

}