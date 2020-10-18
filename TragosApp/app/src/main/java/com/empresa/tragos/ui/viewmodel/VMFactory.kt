package com.empresa.tragos.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.empresa.tragos.domain.Repo

/**
 * Created by Norman Sánchez on 18/10/20.
 */
class VMFactory(private val repo:Repo):ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return modelClass.getConstructor(Repo::class.java).newInstance(repo)
    }
}