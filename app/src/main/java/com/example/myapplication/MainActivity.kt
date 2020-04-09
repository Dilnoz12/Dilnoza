package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val linearLayout: LinearLayout = LinearLayout(this)
        linearLayout.orientation= LinearLayout.VERTICAL
        setContentView(linearLayout)
        val editText= EditText(this)
        val button= Button(this)
        linearLayout.addView(editText)
        linearLayout.addView(button)
        button.setOnClickListener {
            if(editText.text.toString().isNotEmpty()){
                val intent= Intent(this,SecondActivity::class.java)
                intent.putExtra("count",editText.text.toString())
                startActivity(intent)
            }
        }
    }
}
