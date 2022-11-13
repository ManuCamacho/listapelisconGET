package com.example.listapelisconget

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url

interface APIService {
    @GET
    suspend fun getFilm(@Url url:String): Response<FilmResponse>
}