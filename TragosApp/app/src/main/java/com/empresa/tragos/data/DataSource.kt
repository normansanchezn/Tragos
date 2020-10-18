package com.empresa.tragos.data

import com.empresa.tragos.data.model.Drink
import com.empresa.tragos.vo.Resource

/**
 * Created by Norman Sánchez on 18/10/20.
 * Here we have all information created
 */
class DataSource {

    val generateDrinkList = listOf(
        Drink("https://cdn5.recetasdeescandalo.com/wp-content/uploads/2018/09/Coctel-margarita-como-prepararlo.-Receta-e-ingredientes.jpg", "Margarita", "algo"),
        Drink("https://farm3.staticflickr.com/2705/4071850729_9557711f06.jpg", "Toro", "Algo"),
        Drink("https://photos.prnewswire.com/prn/20130828/637406", "Bacacho", "Algo"),
        Drink("https://www.sopitas.com/site/wp-content/uploads/2014/05/cubalibre.jpg", "Nada", "nada")
    )

    fun getTragosList (): Resource<List<Drink>>{
        return Resource.Success(generateDrinkList)
    }

}