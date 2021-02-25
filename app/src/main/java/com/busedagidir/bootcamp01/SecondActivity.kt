package com.busedagidir.bootcamp01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    lateinit var getText : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        getText = findViewById(R.id.getText)

        val getData = intent.getStringExtra("send")
        getText.setText(getData)
    }
}