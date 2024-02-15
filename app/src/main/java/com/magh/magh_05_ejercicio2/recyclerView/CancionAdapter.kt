package com.magh.magh_05_ejercicio2.recyclerView

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.magh.magh_05_ejercicio2.R

class CancionAdapter(private val list: ArrayList<Cancion>) : RecyclerView.Adapter<CancionViewHolder>() {

    var onItemSelected : ((Cancion) -> Unit)? = null
    var onImageSelected : ((Cancion) -> Unit)? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CancionViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recyclerview_item_cancion,parent,false)
        return CancionViewHolder(view)
    }

    override fun getItemCount(): Int  = list.size

    override fun onBindViewHolder(holder: CancionViewHolder, position: Int) {
        holder.render(list[position], onItemSelected, onImageSelected)
    }
}

class CancionViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    val imgAlbum = view.findViewById<ImageView>(R.id.imgAlbum)
    val lblTitulo = view.findViewById<TextView>(R.id.lblTitulo)
    val lblArtistaAlbum = view.findViewById<TextView>(R.id.lblArtistaAlbum)
    val root = view.findViewById<ConstraintLayout>(R.id.root)

    fun render(cancion: Cancion, onItemSelected : ((Cancion) -> Unit)?, onImageSelected : ((Cancion) -> Unit)?){
        lblTitulo.text = cancion.titulo
        lblArtistaAlbum.text = "${cancion.artista} - ${cancion.album}"

        root.setOnClickListener {
            onItemSelected?.invoke(cancion)
        }
        imgAlbum.setOnClickListener {
            onImageSelected?.invoke(cancion)
        }
    }

}

