package com.example.weatherworks

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)
val btn123: Button = findViewById(R.id.btn123)
        btn123.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
        }
    }
}