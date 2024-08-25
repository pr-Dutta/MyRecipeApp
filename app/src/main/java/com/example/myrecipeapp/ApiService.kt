package com.example.myrecipeapp

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

private val retrofit = Retrofit.Builder()
    .baseUrl("https://dummyjson.com/")
    .addConverterFactory(GsonConverterFactory.create())
    .build()

val recipeService = retrofit.create(ApiService::class.java)

interface ApiService {
    @GET("quotes/random")
    suspend fun getCategories(): CategoriesResponse
}










