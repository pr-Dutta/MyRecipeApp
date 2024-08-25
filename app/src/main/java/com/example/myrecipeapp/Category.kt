package com.example.myrecipeapp

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Category(
    val id: Int,
    val quote: String,
    val author: String
): Parcelable

data class CategoriesResponse(val categories: List<Category>)
