package com.example.myrecipeapp

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

// How can we setup a service?, Why we use service and what is it?

// First we have to make a retrofit object
// We have to build the retrofit url then We need to add a converterFactory to
// convert JSON to kotlin object then we have to build it.

// Create a retrofit instance
private val retrofit = Retrofit.Builder().baseUrl("www.themealdb.com/api/json/v1/1/")
    .addConverterFactory(GsonConverterFactory.create())
    .build()

// Create an API service instance
val recipeService = retrofit.create(ApiService::class.java)


// Define the API end points:- where the request will sent
interface ApiService {
    // Why we are defining the @GET inside the interface?
    @GET("categories.php")
    // This getCategories is a service method?
    suspend fun getCategories(): CategoriesResponse
}










