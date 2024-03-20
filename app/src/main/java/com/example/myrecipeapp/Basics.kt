package com.example.myrecipeapp

// How JSON objects are structured
// How JSON object looks like - Ask chat GPT?
data class Potion(
    val name: String,
    val effect: String,
    val potency: Int
)

fun main() {

    val healingPotion = Potion("Healing Potion", "Restores Health", 50)
    val invisibilityPotion = Potion("Invisibility Potion", "Grants Invisibility", 40)
    val strengthPotion = Potion("Strength Potion", "Boosts Strength", 60)

    // It acts as a JSON Object?
    val potionList = listOf(healingPotion, invisibilityPotion, strengthPotion)

    println(potionList)
}