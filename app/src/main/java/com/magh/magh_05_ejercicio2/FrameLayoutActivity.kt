package com.magh.magh_05_ejercicio2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FrameLayoutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_frame_layout)

        val btnFrameSiguiente = findViewById<Button>(R.id.btnFrameSiguiente)
        btnFrameSiguiente.setOnClickListener {
            val intent = Intent(this,LinearLayoutActivity::class.java)
            startActivity(intent)
        }
    }
}