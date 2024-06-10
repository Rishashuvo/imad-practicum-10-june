package com.example.weatherworks

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        val imageView4: ImageView = findViewById(R.id.imageView4)
        val btnMonday: Button = findViewById(R.id.btnMonday)
        val btnTuesday: Button = findViewById(R.id.btnTuesday)
        val btnWednesday: Button = findViewById(R.id.btnWednesday)
        val btnThursday: Button = findViewById(R.id.btnThursday)
        val btnFriday: Button = findViewById(R.id.btnFriday)
        val btnSaturday: Button = findViewById(R.id.btnSaturday)
        val btnSunday: Button = findViewById(R.id.btnSunday)

        btnMonday.setOnClickListener {
            val intent = Intent(this, MainActivity4::class.java)
            startActivity(intent)
        }
        btnTuesday.setOnClickListener {
            val intent = Intent(this, MainActivity5::class.java)

            startActivity(intent)
        }

    }
}