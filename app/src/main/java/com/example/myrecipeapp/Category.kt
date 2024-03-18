package com.example.myrecipeapp


// Here the properties are same as the JSON file individual category properties
data class Category(
    val idCategory: String,
    val strCategory: String,
    val strCategoryThumb: String,
    val strCategoryDescription: String
)

data class CategoryResponse(val categories: List<Category>)
