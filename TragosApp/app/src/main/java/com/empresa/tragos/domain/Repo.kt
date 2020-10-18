package com.empresa.tragos.domain

import com.empresa.tragos.data.model.Drink
import com.empresa.tragos.vo.Resource

/**
 * Created by Norman Sánchez on 18/10/20.
 * Interface where we declare all methods we needed from server
 */
interface Repo {
    fun getTragosList(): Resource<List<Drink>>
}