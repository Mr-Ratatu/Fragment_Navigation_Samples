package com.renat.transaction

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment

class SecondFragmentTransaction : Fragment(R.layout.fragment_second_transaction) {

    companion object {
        private const val NAME_ARGUMENT = "argument"

        /** Получаем экземпляр нашего фрагмента */
        fun newInstance() = SecondFragmentTransaction()

        /** Получаем экземпляр нашего фрагмента c аргументом */
        fun newInstance(argument: String? = null): SecondFragmentTransaction {
            val arguments = Bundle().apply {
                putString(NAME_ARGUMENT, argument)
            }
            return SecondFragmentTransaction().apply { setArguments(arguments) }
        }
    }

    private lateinit var previousBtn: Button
    private lateinit var argumentTxt: TextView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        /** Инициализируем наши вьюшки */
        previousBtn = view.findViewById(R.id.previous_btn)
        argumentTxt = view.findViewById(R.id.argument)

        initListener()
    }

    /** Устанавливаем клики */
    private fun initListener() {
        previousBtn.setOnClickListener {
            /** Возвращаемся к предыдущему стеку  */
            parentFragmentManager.popBackStack()
        }

        /** Получаем наш аргумент с помощью requireArguments и сетим в текст  */
        argumentTxt.text = requireArguments().getString(NAME_ARGUMENT) ?: ""
    }
}