package com.renat.cicerone.navigation

import androidx.fragment.app.Fragment
import com.renat.cicerone.FirstFragmentCicerone
import com.renat.cicerone.SecondFragmentCicerone
import ru.terrakok.cicerone.android.support.SupportAppScreen

object Screens {
    class FirstScreen : SupportAppScreen() {
        override fun getFragment(): Fragment {
            return FirstFragmentCicerone()
        }
    }

    class SecondScreen : SupportAppScreen() {
        override fun getFragment(): Fragment {
            return SecondFragmentCicerone()
        }
    }
}