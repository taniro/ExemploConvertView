package tads.eaj.ufrn.exemploconvertview.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.room.Room
import kotlinx.android.synthetic.main.activity_main.*
import tads.eaj.ufrn.exemploconvertview.R
import tads.eaj.ufrn.exemploconvertview.adapter.LivroAdapter
import tads.eaj.ufrn.exemploconvertview.database.AppDatabase
import tads.eaj.ufrn.exemploconvertview.model.Livro



class MainActivity : AppCompatActivity() {

    val db: AppDatabase by lazy {
        Room.databaseBuilder(this, AppDatabase::class.java, "livros.sqlite")
            .allowMainThreadQueries()
            .build()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        preparaBanco()

        var adapter = LivroAdapter(this, db.dao().listAllInList())
        listview.adapter = adapter
    }

    fun preparaBanco(){
        db.dao().deleteAll()

        val l1 = Livro("Harry Potter e a pedra filosofal", "J. K. Rowling", 2, true)
        val l2 = Livro("Harry Potter e a Câmara Secreta", "J. K. Rowling", 3, true)
        val l3 = Livro("Harry Potter e o Prisioneiro de Azkaban", "J. K. Rowling", 5, true)
        val l4 = Livro("Harry Potter e o Cálice de Fogo", "J. K. Rowling", 2, true)
        val l5 = Livro("Harry Potter e a Ordem da Fênix", "J. K. Rowling", 1, false)
        val l6 = Livro("Harry Potter e o Enigma do Príncipe", "J. K. Rowling", 3, false)
        val l7 = Livro("Harry Potter e as Relíquias da Morte", "J. K. Rowling", 2, false)
        val l8 = Livro("O pistoleiro", "Stephen King", 1, true)
        val l9 = Livro("A Escolha dos Três ", "Stephen King", 5, true)
        val l10 = Livro("As Terras Devastadas", "Stephen King", 4, true)
        val l11 = Livro("Mago e Vidro", "Stephen King", 3, true)
        val l12 = Livro("Lobos de Calla", "Stephen King", 2, false)
        val l13 = Livro("Canção de Susannah", "Stephen King", 4, false)
        val l14 = Livro("A Torre Negra", "Stephen King", 5, false)
        val l15 = Livro("O Vento Pela Fechadura", "Stephen King", 5, true)
        val l16 = Livro("Viagem ao centro da terra ", "Júlio Verne", 3, false)
        val l17 = Livro("Senhor dos Anéis: a sociedade do anel", "Tolkien", 1, true)
        val l18 = Livro("Senhor dos Anéis: as duas torres", "Tolkien", 1, true)
        val l19 = Livro("Senhor dos Anéis: o retorno do rei", "Tolkien", 1, true)
        val l20 = Livro("Dom Casmurro", "Machado de Assis", 4, false)

        //cadastra novamente
        db.dao().inserirAll(
                l1,
                l2,
                l3,
                l4,
                l5,
                l6,
                l7,
                l8,
                l9,
                l10,
                l11,
                l12,
                l13,
                l14,
                l15,
                l16,
                l17,
                l18,
                l19,
                l20
        )
    }
}
