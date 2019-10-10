package tads.eaj.ufrn.exemploconvertview.model

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
class Livro(var titulo: String, var autor: String, var quantidade: Int, var lido: Boolean) {
    @PrimaryKey(autoGenerate = true)
    var id: Long = 0
}