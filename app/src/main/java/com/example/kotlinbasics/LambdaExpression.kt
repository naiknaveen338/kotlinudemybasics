package com.example.kotlinbasics

fun main() {

}

fun sum (a : Int, b: Int) : Int {
    return a + b
}

//lambda expression of the above method
var sum = {a: Int, b:Int -> a + b}

//lambda expression of the above method
var sum2:(Int,Int) -> Int = {a:Int,b:Int -> a + b}