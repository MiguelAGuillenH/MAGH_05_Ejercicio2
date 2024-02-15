package com.magh.magh_05_ejercicio2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.CheckBox
import android.widget.ImageButton
import android.widget.RadioGroup
import android.widget.Spinner
import android.widget.Toast
import com.magh.magh_05_ejercicio2.recyclerView.RecyclerViewActivity

class ComponentSelectionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_component_selection)

        //Spinner
        val comServicio = findViewById<Spinner>(R.id.comServicio)
        val datos = arrayListOf("Cotizaciones","Venta autos nuevos","Venta seminuevos","Compra de tu auto","Prueba de manejo","Contratación de seguro","Venta de refacciones","Servicio preventivo","Servicio correctivo")

        ArrayAdapter(this, android.R.layout.simple_spinner_item, datos).also {
            it.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            comServicio.adapter=it
        }

        comServicio.onItemSelectedListener = object: AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                val itemSelected = datos[position]
                Toast.makeText(this@ComponentSelectionActivity,"Elemento seleccionado: ${itemSelected}",Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                Toast.makeText(this@ComponentSelectionActivity,"Nada seleccionado.",Toast.LENGTH_SHORT).show()
            }

        }

        //Radio Group
        val opgSatisfaccion = findViewById<RadioGroup>(R.id.opgSatisfaccion)
        opgSatisfaccion.setOnCheckedChangeListener { group, checkedId ->
            val valor = when(checkedId){
                R.id.optSatisfaccion1 -> "Muy satisfecho"
                R.id.optSatisfaccion2 -> "Satisfecho"
                R.id.optSatisfaccion3 -> "Ni satisfecho ni insatisfecho"
                R.id.optSatisfaccion4 -> "Insatisfecho"
                R.id.optSatisfaccion5 -> "Muy insatisfecho"
                else -> "Unknown"
            }
            Toast.makeText(this,"Elemento seleccionado: ${valor}",Toast.LENGTH_SHORT).show()
        }

        //Checkbox
        val chkEmail = findViewById<CheckBox>(R.id.chkEmail)
        chkEmail.setOnCheckedChangeListener { buttonView, isChecked ->
            Toast.makeText(this,"Valor del checkbox: ${isChecked}",Toast.LENGTH_SHORT).show()
        }

        //ImageButton
        val btnLink = findViewById<ImageButton>(R.id.btnLink)
        btnLink.setOnClickListener{
            Toast.makeText(this,"ImageButton clicked.",Toast.LENGTH_SHORT).show()
        }

        //Botón Siguiente
        val btnComponentSiguiente = findViewById<Button>(R.id.btnComponentSiguiente)
        btnComponentSiguiente.setOnClickListener {
            val intent = Intent(this, RecyclerViewActivity::class.java)
            startActivity(intent)
        }
    }
}