package com.example.data.util

import android.util.Log
import org.json.JSONException
import org.json.JSONObject
import retrofit2.Response
import java.lang.Exception
import java.lang.StringBuilder

abstract class SafeApiRequest {

    suspend fun <T : Any> safeApiRequest(call: suspend() -> Response<T>): T {
        val response = call.invoke()

        if (response.isSuccessful){
            return response.body()!!
        } else {
            val responseError = response.errorBody()?.string()

            val message = StringBuilder()
            responseError.let {
                try {
                    message.append(JSONObject(it!!).getString("status_message"))
                }catch (e: JSONException){
                    Log.e("Error: ", e.message.toString())
                }
                throw Exception(message.toString())
            }

        }
    }
}