package tads.eaj.ufrn.exemploconvertview.adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import tads.eaj.ufrn.exemploconvertview.R
import tads.eaj.ufrn.exemploconvertview.model.Livro





class LivroAdapter(var c:Context, var livros:List<Livro>):BaseAdapter() {


    override fun getView(position: Int, convertView: View?, viewGroup: ViewGroup?): View {

        Log.i("HOLDER", "GetView invocado...")

        var view = LayoutInflater.from(c).inflate(R.layout.item_livro, viewGroup, false)

        Log.i("HOLDER", "Fazendo buscas por id...")
        val textViewTitulo = view.findViewById<TextView>(R.id.titulo)
        val textViewAutor = view.findViewById<TextView>(R.id.autor)
        val textViewQuantidade = view.findViewById<TextView>(R.id.quantidade)
        val img = view.findViewById<ImageView>(R.id.img)

        val livroescolhido = livros[position]
        textViewTitulo.text = livroescolhido.titulo
        textViewAutor.text = livroescolhido.autor
        textViewQuantidade.text = "${livroescolhido.quantidade}"

        if (livroescolhido.lido) {
            img.setImageResource(R.drawable.open)
        } else {
            img.setImageResource(R.drawable.flat)
        }

        return view
    }


    /*
    override fun getView(position: Int, convertView: View?, viewGroup: ViewGroup?): View {

        Log.i("HOLDER", "GetView invocado...")

        var holder:LivroViewHolder
        var view:View

        if (convertView == null){
            Log.i("HOLDER", "Inflando View...")
            view = LayoutInflater.from(c).inflate(R.layout.item_livro, viewGroup, false)
            holder = LivroViewHolder(view)
            view.tag = holder
        }else{
            view = convertView
            holder  = convertView.tag as LivroViewHolder
        }

        val livroescolhido = livros[position]
        holder.textViewTitulo.text = livroescolhido.titulo
        holder.textViewAutor.text = livroescolhido.autor
        holder.textViewQuantidade.text = "${livroescolhido.quantidade}"

        if (livroescolhido.lido) {
            holder.img.setImageResource(R.drawable.open)
        } else {
            holder.img.setImageResource(R.drawable.flat)
        }

        return view
    }

     */

    override fun getItem(position: Int): Any {
        return livros[position]
    }

    override fun getItemId(position: Int): Long {
        return livros[position].id
    }

    override fun getCount(): Int {
        return livros.size
    }
}