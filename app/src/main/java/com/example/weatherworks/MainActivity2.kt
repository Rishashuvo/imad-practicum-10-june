package com.example.weatherworks

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val btnAverage: Button = findViewById(R.id.btnAverage)
        val et_a: EditText = findViewById(R.id.et_a)
        val et_b: EditText = findViewById(R.id.et_b)
        val ResultTv: TextView = findViewById(R.id.ResultTv)
        val button2: Button = findViewById(R.id.button2)
        //to calculate the avarage temperature
        btnAverage.setOnClickListener {
            try {
                val numA = et_a.text.toString().toDouble()
                val numB = et_b.text.toString().toDouble()
                val sum = (numA + numB)/2
                ResultTv.text = "Result: $sum"
            } catch (e: NumberFormatException) {
                ResultTv.text = "Please enter valid numbers"
                //the next code is to add info on clicking on monday button if the average is 18.5
                val  ResultTv = 18.5
                if ( ResultTv == 18.5){
                 println("enter Monday info")
                 }
                button2.setOnClickListener {
                    val intent = Intent(this, MainActivity3::class.java)
                    startActivity(intent)
                }
            }
        }







    }
}