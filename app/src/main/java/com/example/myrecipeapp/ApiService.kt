package com.example.myrecipeapp

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

// How can we setup a service?, Why we use service and what is it?


// A retrofit instance is created specifying the base URl of the API and a
// conversion factory to handel the conversion of JSON response to kotlin object

// Retrofit.Builder() :- This initialize a new retrofit builder, builder is used to
// configure and create a retrofit instance

// .baseUrl() :- Here you set the base url for the API endpoints, All endpoint paths
// specified in your API interface will be appended to this base url

// .addConverterFactory(GsonConverterFactory.create()) : - This line adds a conversion
// factory to the builder

// .builder() :- Finally, this method call creates and returns a Retrofit instance
private val retrofit = Retrofit.Builder()
    .baseUrl("www.themealdb.com/api/json/v1/1/")
    .addConverterFactory(GsonConverterFactory.create())
    .build()

// Create an API service instance

// retrofit.create(ApiService::class.java) :- This line tells the Retrofit instance
// to create an implementation of the ApiService interface

// ApiService::class.java :- This path specifies the class type of the API service
// interface that Retrofit should create an implementation for.
val recipeService = retrofit.create(ApiService::class.java)


// An interface (ApiService) defines the API endpoint, and a request is made to fetch data
// This is an API interface
interface ApiService {
    @GET("categories.php")
    // This getCategories is a service method?
    suspend fun getCategories(): CategoriesResponse
}










