package com.dino.navigationstudy

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.dialog_introduction.*

class IntroductionDialogFragment : DialogFragment() {

    private val args by navArgs<IntroductionDialogFragmentArgs>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.dialog_introduction, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val introductionText = "${args.name}(${args.age})"
        tv_introduction.text = introductionText
    }
}