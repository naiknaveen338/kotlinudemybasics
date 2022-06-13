package com.example.kotlinbasics

fun main() {
    val intArray = intArrayOf(1,2,3,4,5)

    val numbers = arrayOf(1,2,3,4)
    println(numbers) // Prints object

    println(numbers.contentToString()) //prints array

    for (value in numbers) {
        println(value)
    }

    numbers[0] = 55
    println(numbers.contentToString())

    val days = arrayOf("mon","tues","wed")
    println(days.contentToString())


    val fruits = arrayOf(Fruits("apple",25.0), Fruits("mangoes",10.0))
    println(fruits.contentToString())
    println(fruits[0].name)

    val mix = arrayOf("masdas",1,5.7f,"asdasdas")
    println(mix.contentToString())
}

data class Fruits (val name: String, val price : Double) {

}