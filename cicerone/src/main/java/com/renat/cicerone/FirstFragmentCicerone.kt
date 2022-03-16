package com.renat.cicerone

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import com.renat.base.replaceFragment
import com.renat.cicerone.navigation.AppRouter
import com.renat.cicerone.navigation.Screens
import ru.terrakok.cicerone.Cicerone
import ru.terrakok.cicerone.Router
import ru.terrakok.cicerone.commands.Forward

class FirstFragmentCicerone : Fragment(R.layout.fragment_first_cicerone) {

    private val cicerone: Cicerone<AppRouter> = Cicerone.create(AppRouter())
    private val router: Router = cicerone.router

    private lateinit var secondFragmentBtn: Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        /** Инициализируем наши вьюшки */
        secondFragmentBtn = view.findViewById(R.id.second_fragment_btn)

        initListener()
    }

    /** Устанавливаем клики */
    private fun initListener() {
        secondFragmentBtn.setOnClickListener {
            router.newRootScreen(Screens.SecondScreen())
        }
    }
}