package ru.geekbrains.lesson05.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.geekbrains.lesson05.R
import ru.geekbrains.lesson05.view.main.MainFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitAllowingStateLoss()
        }
    }
}