package com.example.myrecipeapp

// what is sealed class? - Have to learn in detail
// sealed class ensures type safety by restricting the set of type at compile time only.
// sealed class is implemented as an abstract class which can't be instantiated.
// The constructor of a sealed class is private and we can't make it non-private

// It's used when it's known in advance that a type will conform one of the
// subclass types

// Here we want to store the route for the individual Screen and
// also for not wrongly type the route while required
sealed class Screen(val route: String) {

    // This are the sub class/ objects of the sealed class Screen()
    // These subclasses/ objects should be defined within the same file
    // sealed class is itself defined

    // Inside sealed class we can have regular class, data class,
    // object of it, other sealed class and sealed interface as well
    object RecipeScreen: Screen("recipescreen")
    object DetailScreen: Screen("detailscreen")
}