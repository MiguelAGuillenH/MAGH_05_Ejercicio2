package com.magh.magh_05_ejercicio2.recyclerView

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.magh.magh_05_ejercicio2.R

class RecyclerViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        val canciones =arrayListOf<Cancion>(
            Cancion("Sinister Purpose","Creedence Clearwater Revival", "Green River"),
            Cancion("Galatea's Guitar","Gábor Szabó", "Dreams"),
            Cancion("Upside Down","Hawkwind", "Space Ritual"),
            Cancion("3/5 of a Mile in 10 Seconds","Jefferson Airplane", "Surrealistic Pillow"),
            Cancion("Seven and Seven Is","Love", "Da Capo"),
            Cancion("Sticks and Stones","The Zombies", "Begin Here"),
            Cancion("Green Grass & High Tides","The Outlaws", "The Outlaws"),
            Cancion("Miss America","Styx", "The Grand Illusion"),
            Cancion("Heaven Tonight","Cheap Trick", "Heaven Tonight"),
            Cancion("Intruder","Peter Gabriel", "Peter Gabriel 3: Melt")
        )

        val listaCanciones = findViewById<RecyclerView>(R.id.ListaCanciones)
        val adapter =CancionAdapter(canciones)

        adapter.onItemSelected = {
            Toast.makeText(this,"Cancion seleccionada: ${it.titulo}", Toast.LENGTH_SHORT).show()
        }
        adapter.onImageSelected = {
            Toast.makeText(this,"Imágen seleccionada: ${it.titulo}", Toast.LENGTH_SHORT).show()
        }

        listaCanciones.adapter = adapter
        listaCanciones.layoutManager =LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)

    }
}