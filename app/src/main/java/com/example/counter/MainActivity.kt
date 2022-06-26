package com.example.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var num=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val Button1: Button = findViewById(R.id.button)
        Button1.setOnClickListener {
            num++
            val textView:TextView=findViewById((R.id.textView))
            textView.text=num.toString()
        }
    }
}