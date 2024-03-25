package com.example.myrecipeapp

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {

    private val _categoriesState = mutableStateOf(RecipeState())
    val categoriesState: State<RecipeState> = _categoriesState


    init {
        fetchCategories()
    }
    private fun fetchCategories() {
        // A viewModelScope provides a launch for suspend functions to be processed
        // Suspend function runs in the background
        // We have to start a suspend function inside a coroutine
        viewModelScope.launch {
            // Coroutines allows you to run a routine in the background
            try {
                val response = recipeService.getCategories()
                _categoriesState.value = _categoriesState.value.copy(
                    list = response.categories,
                    loading = false,
                    error = null
                )
            }catch (e: Exception) {
                _categoriesState.value = _categoriesState.value.copy(
                    loading = false,
                    error = "Error fetching Categories: ${e.message}"
                )
            }
        }
    }

    // This data class will take care of recipe state
    data class RecipeState(
        val loading: Boolean = true,
        val list: List<Category> = emptyList(),
        val error: String? = null
    )
}