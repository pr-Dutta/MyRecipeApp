package com.example.myrecipeapp

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

// What is NavHostController?
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

                    // navController.currentBackStackEntry: This part retrieves the current navigation
                    // backStackEntry, which represents the current screen state within the navigation
                    // graph.

                    // savedStateHandle: It's a mechanism for passing data between screens using the
                    // jetpack compose navigation, It provides a way to store and retrieve data that
                    // needs to be passed to the next screen.

                    // set("cat", it): This methods sets a key-value pare in the saveStateHandler,
                    // the key here is "cat" and the value is it (Category).
                    // The key is used as a reference to retrieve the data on the detail scree.

                    // Here we are storing the category in the NavBackStaceEntry with the key "cat"
                    navController.currentBackStackEntry?.savedStateHandle?.set("cat", it)
                    navController.navigate(Screen.DetailScreen.route)
                }
            )
        }

        composable(route = Screen.DetailScreen.route) {
            val category = navController.previousBackStackEntry?.savedStateHandle?.get<Category>("cat")
                ?: Category("", "", "", "")
            CategoryDetailScreen(category = category)
        }
    }
}




