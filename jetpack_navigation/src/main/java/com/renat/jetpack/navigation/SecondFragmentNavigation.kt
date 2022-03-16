package com.renat.jetpack.navigation

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs

class SecondFragmentNavigation : Fragment(R.layout.fragment_second_navigation) {

    /** Получаем наши аргументы, которые отправляет FirstFragmentNavigation */
    private val argument: SecondFragmentNavigationArgs by navArgs()

    private lateinit var previousBtn: Button
    private lateinit var argumentTxt: TextView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        /** Инициализируем наши вьюшки */
        previousBtn = view.findViewById(R.id.previous_btn)
        argumentTxt = view.findViewById(R.id.argument)

        initView()
    }

    /** Устанавливаем клики и текст */
    private fun initView() {
        previousBtn.setOnClickListener {
            /** Возвращаемся к предыдущему стеку  */
            findNavController().popBackStack()
        }

        argumentTxt.text = argument.name
    }
}