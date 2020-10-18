package com.empresa.tragos.domain

import com.empresa.tragos.data.DataSource
import com.empresa.tragos.data.model.Drink
import com.empresa.tragos.vo.Resource

/**
 * Created by Norman Sánchez on 18/10/20.
 * Class that implements interface that help us to get information from DataSource
 */
class RepoImpl(private val dataSource: DataSource): Repo {
    override fun getTragosList(): Resource<List<Drink>> {
        return dataSource.getTragosList()
    }
}