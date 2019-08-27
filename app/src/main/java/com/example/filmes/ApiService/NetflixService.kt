package com.example.filmes.ApiService

import com.example.filmes.Models.Netflix
import retrofit2.Call
import retrofit2.http.GET

interface NetflixService {

    @GET("popular?api_key=a8b15cb8e4b148e23a32afe20e64cde9&language=pt-BR")
    fun listFilmes(): Call<Netflix>

}