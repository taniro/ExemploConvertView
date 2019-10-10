package tads.eaj.ufrn.exemploconvertview.database

import androidx.room.Database
import androidx.room.RoomDatabase
import tads.eaj.ufrn.exemploconvertview.model.Livro

@Database(entities = arrayOf(Livro::class), version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun dao():LivroDao
}