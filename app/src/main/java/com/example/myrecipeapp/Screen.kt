package com.example.myrecipeapp

// what is sealed class? - Have to learn in detail
// sealed class ensures type safety by restricting the set of type at compile time only.
// sealed class is implemented as an abstract class which can't be instantiated.
// The constructor of a sealed class is private and we can't make it non-private
sealed class Screen(val route: String) {

    // This are the sub class/ objects of the sealed class Screen()
    // These subclasses/ objects should be defined within the same file
    // sealed class is itself defined

    // Inside sealed class we can have regular class, data class,
    // object of it ans other sealed class ans sealed interface as well
    object RecipeScreen: Screen("recipescreen")
    object DetailScreen: Screen("detailscreen")
}