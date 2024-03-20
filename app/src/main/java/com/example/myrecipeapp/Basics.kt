package com.example.myrecipeapp

fun main() {

    println("Please enter a number: ")

    var number: Int

    try {
        // Error prone code you want to execute
        number = readln().toInt()
        println("User entered : $number")
    }catch (e: Exception) {
        // what should happen when an error occurs
        println( "Error: ${ e.message }")
    }finally {
        number = 0
    }

}