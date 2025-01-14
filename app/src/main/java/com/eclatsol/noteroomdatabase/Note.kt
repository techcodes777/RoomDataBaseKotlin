package com.eclatsol.noteroomdatabase

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName ="note_table")
class Note(@ColumnInfo(name = "text") val text : String) {
    @PrimaryKey(autoGenerate = true) var id = 0
}