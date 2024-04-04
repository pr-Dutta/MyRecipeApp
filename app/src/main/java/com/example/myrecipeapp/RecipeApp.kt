package com.example.myrecipeapp

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun RecipeApp(navController: NavHostController) {

    val recipeViewModel: MainViewModel = viewModel()
    val viewState by recipeViewModel.categoriesState
    
    NavHost(navController = navController, startDestination = Screen.RecipeScreen.route) {
        composable(Screen.RecipeScreen.route) {
            RecipeScreen(
                viewState = viewState,
                navigateToDetail = {

                // This part is responsible for passing the data from the current screen to the detail.
                // It utilizes the saveStateHandler, which is a component of the Compose navigation framework.
                    navController.currentBackStackEntry?.savedStateHandle?.set("cat", it)
                    navController.navigate(Screen.DetailScreen.route)
                }
            )
        }
    }
}




