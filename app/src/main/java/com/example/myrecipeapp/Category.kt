package com.example.myrecipeapp

// This Category data class is for holding the data - (22-03-2024)

// Here Category data class represents the individual category items - (22-03-2024)
// We will get a list of individual category items - (22-03-2024)
data class Category(
    val idCategory: String,
    val strCategory: String,
    val strCategoryThumb: String,
    val strCategoryDescription: String
)


// This data class holds the list of the type Category - (22-03-2024)
// This class will hold the Categories Response from the MealDB - (22-03-2024)
data class CategoriesResponse(val categories: List<Category>)
