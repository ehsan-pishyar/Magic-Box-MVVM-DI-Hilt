package com.example.data.util

interface StateListener {

    fun onLoading()

    fun onSuccess(message:String)

    fun onError(message: String?)
}