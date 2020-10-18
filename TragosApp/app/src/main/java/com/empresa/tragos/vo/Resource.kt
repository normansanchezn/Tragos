package com.empresa.tragos.vo

/**
 * Created by Norman Sánchez on 18/10/20.
 * This class help us how to return information from server
 */
sealed class Resource<out T> {
    class Loading<out T> : Resource<T>()
    data class Success<out T> (val data: T) : Resource<T>()
    //data class Failure<out T>(val exception: Exception) : Resource<T>()
    data class Failure<out T> (val e: Exception) : Resource<T>()
}