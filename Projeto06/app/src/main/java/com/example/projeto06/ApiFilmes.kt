package com.example.projeto06

import com.example.projeto06.Filme
import retrofit2.Call
import retrofit2.http.GET

interface ApiFilmes {
    @GET("/filmes")
    fun get(): Call<List<Filme>>

}