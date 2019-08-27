package com.example.filmes.ApiService

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitInitializer {

    private val retrofit = Retrofit.Builder()
    .baseUrl("https://api.themoviedb.org/3/movie/")
    .addConverterFactory(GsonConverterFactory.create())
    .build()

    fun netflixService() = retrofit.create(NetflixService::class.java)

}