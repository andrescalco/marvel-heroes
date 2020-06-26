package com.andrescalco.marvelheros

import okhttp3.OkHttpClient
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET


// interface
interface MarvelHeroesService {
    @GET("/api/all")
    fun getAll(): Call<List<Characters>>
}

object RestClient {
    private const val url = "https://marvel-heroes-api.vercel.app"
    private val client = OkHttpClient.Builder().build()

    val instance: MarvelHeroesService by lazy {
        val retrofit = Retrofit.Builder()
            .baseUrl(url)
            .addConverterFactory(GsonConverterFactory.create())
            .client(client)
            .build()

        retrofit.create(MarvelHeroesService::class.java)
    }
}

//object ServiceBuilder {
//    private val client = OkHttpClient.Builder().build()
//
//    private val retrofit = Retrofit.Builder()
//        .baseUrl("https://marvel-heroes-api.vercel.app")
//        .addConverterFactory(GsonConverterFactory.create())
//        .client(client)
//        .build()
//
//    fun<T> buildService(service: Class<T>): T{
//        return retrofit.create(service)
//    }
//}