package com.empresa.tragos.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.empresa.tragos.domain.Repo
import com.empresa.tragos.vo.Resource
import kotlinx.coroutines.Dispatchers

/**
 * Created by Norman Sánchez on 18/10/20.
 */
class MainViewModel(private val repo:Repo): ViewModel() {

    val fetchTragosList = liveData(Dispatchers.IO) {
        emit(Resource.Loading())
        try {
            emit(Resource.Success(repo.getTragosList()))
        } catch (e: Exception) {
            //emit(Resource.Failure(e))
        }
    }

}