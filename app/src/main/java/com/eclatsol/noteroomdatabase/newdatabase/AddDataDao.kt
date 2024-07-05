package com.eclatsol.noteroomdatabase.newdatabase

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface AddDataDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(addData: AddData)

    @Delete()
    suspend fun delete(addData: AddData)

    @Query("Select * from add_data order by id ASC")
    fun getAllAddData() : LiveData<List<AddData>>
}