package com.eclatsol.noteroomdatabase.newdatabase

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "add_data")
class AddData(@ColumnInfo(name = "text") val text : String) {
    @PrimaryKey(autoGenerate = true) var id = 0
}