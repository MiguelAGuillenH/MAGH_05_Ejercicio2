package com.magh.magh_05_ejercicio2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LinearLayoutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_linear_layout)

        val btnLinearSiguiente = findViewById<Button>(R.id.btnLinearSiguiente)
        btnLinearSiguiente.setOnClickListener {
            val intent = Intent(this,RelativeLayoutActivity::class.java)
            startActivity(intent)
        }
    }
}