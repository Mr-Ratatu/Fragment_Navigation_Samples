package com.renat.cicerone

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import ru.terrakok.cicerone.android.support.SupportAppScreen

class SecondFragmentCicerone : Fragment(R.layout.fragment_second_cicerone) {

    private lateinit var previousBtn: Button
    private lateinit var argumentTxt: TextView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        /** Инициализируем наши вьюшки */
        previousBtn = view.findViewById(R.id.previous_btn)
        argumentTxt = view.findViewById(R.id.argument)

        initListener()
    }

    private fun initListener() {
        previousBtn.setOnClickListener {
        }
    }
}