package tads.eaj.ufrn.exemploconvertview.adapter

import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import tads.eaj.ufrn.exemploconvertview.R


class LivroViewHolder(v: View) {

    val textViewTitulo: TextView
    val textViewAutor: TextView
    val textViewQuantidade: TextView
    val img: ImageView

    init {
        Log.i("HOLDER", "Fazendo buscas por id...")
        textViewTitulo = v.findViewById(R.id.titulo)
        textViewAutor = v.findViewById(R.id.autor)
        textViewQuantidade = v.findViewById(R.id.quantidade)
        img = v.findViewById(R.id.img)
    }
}