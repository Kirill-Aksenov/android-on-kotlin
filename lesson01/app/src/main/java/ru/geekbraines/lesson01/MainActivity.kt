package ru.geekbraines.lesson01

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.textView)
        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            if (textView.text == getString(R.string.tv_text)) {
                textView.text = getString(R.string.tv_text2)
                forEachCycle()
            } else {
                textView.setText(R.string.tv_text)
                closedRangeCycle()
            }
        }

        val dataClass = DataClass("DataClass", 100)
        val testObject = dataClass.copy(text = "DataClassCopy", number = 200)

        textView.setOnLongClickListener {
            if (textView.text != "${dataClass.text} ${dataClass.number}") {
                textView.text = "${dataClass.text} ${dataClass.number}"
                closedRangeCycleReverse()
            } else {
                textView.text = "${testObject.text} ${testObject.number}"
                closedRangeCycleReverseWithStep()
            }
            true
        }
    }

    private fun forEachCycle() {
        val arrayList = arrayListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        for (i in arrayList) {
            Log.d("forEachCycle", i.toString())
        }
    }

    private fun closedRangeCycle() {
        for (i in 1..50) {
            Log.d("closedRangeCycle", i.toString())
        }
    }

    private fun closedRangeCycleReverse() {
        for (i in 100 downTo 50) {
            Log.d("closedRangeCycleReverse", i.toString())
        }
    }

    private fun closedRangeCycleReverseWithStep() {
        for (i in 50 downTo 0 step 5) {
            Log.d("closedRangeCycleReverseWithStep", i.toString())
        }
    }
}