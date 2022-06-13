package com.example.kotlinbasics

fun main() {
    //Immutable
    val fruits = setOf("apple","orange","mango","kiwi","apple")
    println(fruits.size) //Size is 4 not 5 coz. set takes only unique item

    val newFruits = fruits.toMutableSet()
    newFruits.add("grapes")
    println(newFruits)

    println(newFruits.toSortedSet())

    println(newFruits.elementAt(3))
}