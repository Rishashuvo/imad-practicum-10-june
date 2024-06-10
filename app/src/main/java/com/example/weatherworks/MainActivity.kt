package com.example.weatherworks

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val imageView2: ImageView = findViewById(R.id.imageView2)
        val imgSun: ImageView = findViewById(R.id.imgSun)

        val btnWelcome : Button = findViewById(R.id.btnWelcome)
        btnWelcome.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }


    }
}