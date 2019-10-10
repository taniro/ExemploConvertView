package tads.eaj.ufrn.exemploconvertview.database

import androidx.room.*
import tads.eaj.ufrn.exemploconvertview.model.Livro


@Dao
interface LivroDao {

    @Query("SELECT COUNT(id) FROM Livro")
    fun numberOfRows(): Int

    @Insert
    fun inserir(l: Livro): Long

    @Insert
    fun inserirAll(vararg l: Livro): LongArray

    @Delete
    fun deletar(l: Livro): Int

    @Query("DELETE FROM Livro")
    fun deleteAll(): Int

    @Update
    fun atualizar(l: Livro): Int

    @Query("SELECT * FROM Livro")
    fun listAllinArray(): Array<Livro>

    @Query("SELECT * FROM Livro")
    fun listAllInList(): List<Livro>

    @Query("SELECT * FROM Livro WHERE id = :id")
    fun listById(id: Long): Array<Livro>
}