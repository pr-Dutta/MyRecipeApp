package com.example.myrecipeapp

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

// How can we setup a service

// First we have to make a retrofit object

// it's a retrofit object

// We have to build the retrofit url then We need to add a converterFactory to
// convert JSON to kotlin object then we have to build it.
private val retrofit = Retrofit.Builder().baseUrl("www.themealdb.com/api/json/v1/1/")
    .addConverterFactory(GsonConverterFactory.create())
    .build()
// This retrofit Builder() is responsible for preparing the end point and adding the JSON
// converter it than provides the create method for gaining access to the service methods


// Let's build a connection to this base url do it in a format that we get what
// we can convert to kotlin object

// setting up a service based on the retrofit object and create it using our ApiService
// Why we create services?
val recipeService = retrofit.create(ApiService::class.java)


interface ApiService {

    // Why we are defining the @GET inside the interface?
    @GET("categories.php")


    // This is only the definition of the function
    suspend fun getCategories(): CategoriesResponse
    // This get category is a service method
}










