package com.eclatsol.noteroomdatabase.newdatabase

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class AddDataViewModel(application: Application) : AndroidViewModel(application) {

    var allAddData: LiveData<List<AddData>>
    var dataRepository: DataRepository

    init {
        val addDataBaseDao =
            AddDataBase.getAddDataBase(application.applicationContext).getAddDataDao()
        dataRepository = DataRepository(addDataBaseDao)
        allAddData = addDataBaseDao.getAllAddData()
    }

    fun insert(addData: AddData) = viewModelScope.launch(Dispatchers.IO) {
        dataRepository.insert(addData)
    }

    fun delete(addData: AddData) = viewModelScope.launch(Dispatchers.IO) {
        dataRepository.delete(addData)
    }
}