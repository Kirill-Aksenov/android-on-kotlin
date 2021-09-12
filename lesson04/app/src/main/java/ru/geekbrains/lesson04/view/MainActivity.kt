package ru.geekbrains.lesson04.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.geekbrains.lesson04.R
import ru.geekbrains.lesson04.view.main.MainFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }
    }
}