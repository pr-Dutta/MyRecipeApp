package com.example.myrecipeapp

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

// How can we setup a service

// it's a retrofit object
private val retrofit = Retrofit.Builder().baseUrl("www.themealdb.com/api/json/v1/1/")
    .addConverterFactory(GsonConverterFactory.create())
    .build()

// setting up a service
val recipeService = retrofit.create(ApiService::class.java)

// This may be a repository
interface ApiService {

    // CategoriesResponse is a Data Class which holds a list of Category - (22-03-2024)

    // This @GET comes from retrofit2.http, this GET allows us to do http request - (22-03-2024)
    // Now we have to define where this http request go to
    // In our case this request goes to ""categories.php
    // The categories.php is come from the MealDB api
    @GET("categories.php")  // Why the GET is used ask ChatGpt ? - - (22-03-2024)
    // This GET keyword is used to specify the type of request that should be made
    // to a particular URl ("categories.php") which represents the end point where the
    // get request will be sent

    // Retrofit uses the annotation @ - to generate the necessary code to make the - (22-03-2024)
    // network request, sent to get request to the specifies URL and process the
    // response data

    suspend fun getCategories(): CategoriesResponse
}










