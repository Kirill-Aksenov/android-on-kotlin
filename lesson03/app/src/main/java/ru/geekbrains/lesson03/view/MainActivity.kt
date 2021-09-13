package ru.geekbrains.lesson03.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.geekbrains.lesson03.R
import ru.geekbrains.lesson03.view.main.MainFragment

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