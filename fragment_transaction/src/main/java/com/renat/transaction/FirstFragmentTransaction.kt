package com.renat.transaction

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import com.renat.base.isTablet
import com.renat.base.replaceFragment

class FirstFragmentTransaction : Fragment(R.layout.fragment_first_transaction) {

    companion object {
        /** Получаем экземпляр нашего фрагмента */
        fun newInstance() = FirstFragmentTransaction()
    }

    private lateinit var secondFragmentBtn: Button
    private lateinit var navigateWithAnimationBtn: Button
    private lateinit var navigateWithArgumentBtn: Button
    private lateinit var previousBtn: Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        /** Инициализируем наши вьюшки */
        secondFragmentBtn = view.findViewById(R.id.second_fragment_btn)
        navigateWithAnimationBtn = view.findViewById(R.id.with_animation_btn)
        navigateWithArgumentBtn = view.findViewById(R.id.with_argument_btn)
        previousBtn = view.findViewById(R.id.previous_btn)

        initListener()
    }

    /** Устанавливаем клики */
    private fun initListener() {
        secondFragmentBtn.setOnClickListener {
            /** Переходим к следующему фрагменту с сохранением состояния, но без анимации  */
            parentFragmentManager.replaceFragment(
                container = com.renat.base.R.id.fragment_container,
                fragment = SecondFragmentTransaction.newInstance(argument = null),
                needBackstack = true
            )
        }

        navigateWithAnimationBtn.setOnClickListener {
            /** Переходим к следующему фрагменту с сохранением состояния и анимацией   */
            parentFragmentManager.replaceFragment(
                container = com.renat.base.R.id.fragment_container,
                fragment = SecondFragmentTransaction.newInstance(argument = null),
                needBackstack = true,
                needAnimation = true
            )
        }

        navigateWithArgumentBtn.setOnClickListener {
            val ourValue = "Наше переданное значение"

            /** Навигируемся к другому фрагменту с отправкой значения   */
            parentFragmentManager.replaceFragment(
                container = com.renat.base.R.id.fragment_container,
                fragment = SecondFragmentTransaction.newInstance(argument = ourValue),
                needBackstack = true
            )
        }

        previousBtn.setOnClickListener {
            /** Возвращаемся к предыдущему стеку  */
            parentFragmentManager.popBackStack()
        }
    }
}