package com.example.myrecipeapp

fun main() {
    var number: Int
    println("Please enter a number:")
    try {
        // Error prone code you want to execute
        number = readln().toInt()
        println("User entered: $number")
    }catch (e: Exception) {
        // What should happen when an error occurs
        println("Error:- ${e.message}")
    }finally {
        number = 0
    }
}