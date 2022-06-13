package com.example.kotlinbasics

fun main() {
    val results = listOf(1,"dsd",33,"hi")
    println(results)

    //List are immutable we cannot add any item
    //results.add

    //Converting list to mutable list
    val result2 = results.toMutableList()
    result2.add(5)
    println(result2)


    val result3 = listOf("hello","hey")
    result2.addAll(result3)
    println(result2)

    val days = mutableListOf<String>("mon","tues")
    days[0] = "sunday"
    println(days)
    days.removeAt(0)



}