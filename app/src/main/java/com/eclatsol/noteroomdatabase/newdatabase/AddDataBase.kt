package com.eclatsol.noteroomdatabase.newdatabase

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [AddData::class], version = 1, exportSchema = false)
abstract class AddDataBase() : RoomDatabase() {
    abstract fun getAddDataDao(): AddDataDao

    companion object {

        @Volatile
        private var INSTANCE: AddDataBase? = null

        fun getAddDataBase(context: Context): AddDataBase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AddDataBase::class.java,
                    "add_database"
                ).build()
                INSTANCE = instance
                instance
            }
        }

    }
}