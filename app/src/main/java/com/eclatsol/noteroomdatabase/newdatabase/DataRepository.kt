package com.eclatsol.noteroomdatabase.newdatabase

import androidx.lifecycle.LiveData

class DataRepository(private val addDataDao: AddDataDao) {

    val allAddData : LiveData<List<AddData>> = addDataDao.getAllAddData()
    suspend fun insert(addData: AddData){
        addDataDao.insert(addData)
    }

    suspend fun delete(addData: AddData){
        addDataDao.delete(addData)
    }

}