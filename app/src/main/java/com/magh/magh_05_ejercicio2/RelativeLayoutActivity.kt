package com.magh.magh_05_ejercicio2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RelativeLayoutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_relative_layout)

        val btnRelativeSiguiente = findViewById<Button>(R.id.btnRelativeSiguiente)
        btnRelativeSiguiente.setOnClickListener {
            val intent = Intent(this, ConstraintLayoutActivity::class.java)
            startActivity(intent)
        }
    }
}