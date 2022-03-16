package com.renat.samples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.renat.base.addFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.renat.base.R.layout.main_container)

        /** Показываем наш базовый фрагмент */
        supportFragmentManager.addFragment(
            container = com.renat.base.R.id.fragment_container,
            fragment = HomeFragment.newInstance()
        )
    }
}