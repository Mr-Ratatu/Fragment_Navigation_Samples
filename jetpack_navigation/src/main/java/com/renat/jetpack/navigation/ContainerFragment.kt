package com.renat.jetpack.navigation

import androidx.fragment.app.Fragment

class ContainerFragment : Fragment(R.layout.fragment_container) {

    companion object {
        /** Получаем экземпляр нашего фрагмента */
        fun newInstance() = ContainerFragment()
    }
}