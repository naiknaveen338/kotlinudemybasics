package com.example.kotlinbasics

fun main() {
    val daysOfWeek = mapOf(1 to "Monday", 2 to "Tuesday", 3 to "Wendsday")
    println(daysOfWeek[2])

    //Printing keys
    for (key in daysOfWeek.keys) {
        println("key is $key and value is ${daysOfWeek[key]}")
    }

    val map = mapOf(1 to Fruit("mango", 600), "second" to 650)
    println(map["second"])

    for (value in map.entries) {
        println(value)
    }

    val mutableMap = map.toMutableMap()
    mutableMap[3] = "Hell0"

    println(mutableMap)
}

data class Fruit(val name: String, val price: Int)