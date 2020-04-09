package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.ScrollView

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val scrollView = ScrollView(this)
        setContentView(scrollView)
        val linearLayout = LinearLayout(this)
        setContentView(linearLayout)
        linearLayout.orientation = LinearLayout.VERTICAL
        val count = intent.getStringExtra("count")!!
        for (i in 0 until count.toInt()) {
            scrollView.addView(linearLayout)
            val button = Button(this)
            button.text = "button${i + 1}"
            linearLayout.addView(button)
        }
    }
}
