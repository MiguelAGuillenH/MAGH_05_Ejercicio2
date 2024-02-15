package com.magh.magh_05_ejercicio2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ConstraintLayoutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_constraint_layout)

        val btnConstraintSiguiente = findViewById<Button>(R.id.btnConstraintSiguiente)
        btnConstraintSiguiente.setOnClickListener {
            val intent = Intent(this, ComponentSelectionActivity::class.java)
            startActivity(intent)
        }
    }
}