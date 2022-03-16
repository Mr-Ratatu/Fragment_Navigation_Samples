package com.renat.jetpack.navigation

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class FirstFragmentNavigation : Fragment(R.layout.fragment_first_navigation) {

    private lateinit var secondFragmentBtn: Button
    private lateinit var previousBtn: Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        /** Инициализируем наши кнопки */
        secondFragmentBtn = view.findViewById(R.id.second_fragment_btn)
        previousBtn = view.findViewById(R.id.previous_btn)

        initListener()
    }

    /** Устанавливаем клики */
    private fun initListener() {
        secondFragmentBtn.setOnClickListener {
            val value = "Our value"

            /** Переходим к следующему фрагменту с сохранением состояния и анимацией  */
            findNavController().navigate(
                FirstFragmentNavigationDirections
                    .actionFirstFragmentNavigationToSecondFragmentNavigation(value)
            )

            /** Мы также можем навигировать с использованием id  */
//            findNavController().navigate(R.id.action_firstFragmentNavigation_to_secondFragmentNavigation)
        }

        previousBtn.setOnClickListener {
            /** Возвращаемся к предыдущему стеку  */
            parentFragmentManager.popBackStack()
        }
    }
}