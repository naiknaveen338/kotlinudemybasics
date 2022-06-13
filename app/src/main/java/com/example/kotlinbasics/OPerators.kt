package com.example.kotlinbasics

fun main(){
    //Arithmetic operators (+, -, *, /, %)
    var result = 5+3
    result = result / 2
    // alternatively
    // result /= 2
    result = result * 5
    result = result - 1
    var moduloResult = 5%2
    println( moduloResult)

    //Comparison operators (==, !=, <, >, <=, >=)
    val isEqual = 5==3
    // Concatenation - adding of "Strings"
    println("isEqual is " + isEqual)
    val isNotEqual = 5!=5
    // Kotlin has a feature called String Interpolation.
    // This feature allows you to directly insert a template expression inside a String.
    // Template expressions are tiny pieces of code that are evaluated and
    // their results are concatenated with the original String.
    // A template expression is prefixed with $ symbol.
    // Following are examples of String interpolation
    println("isNotEqual is $isNotEqual")

    println("is5Greater3 ${5 > 3}")
    println("is5LowerEqual3 ${5 >= 3}")
    println("is5LowerEqual5 ${5 >= 5}")

    //Assignment operators (+=, -=, *=, /=, %=)
    var myNum = 5
    myNum += 3
    println("myNum is $myNum")
    myNum *= 4
    println("myNum is $myNum")


    //Increment & Decrement operators (++, --)
    myNum++
    println("myNum is $myNum")
    // increments after use
    println("myNum is ${myNum++}")
    // increments before use
    println("myNum is ${++myNum}")
    println("myNum is ${--myNum}")

    //If expression
    var a = 10
    var b = 9
    if (a > b) println("a > b") else print("a < c")

    //In Kotlin, if is an expression: it returns a value.
    // Therefore, there is no ternary operator (condition ? then : else) because ordinary if works fine in this role.
    //Return value for If condition
    val max = if (a > b) {
        a
    } else {
        b
    }
    println("Value of max : $max")

   //when statement (Like switch)
    var season = 3
    when(season) {
        1 -> println("winter")
        2 -> println("spring")
        3 -> {
            println("summer")
        }
        4 -> println("Fall")
    }

    var month = 15
    when(month) {
        in 3..5 -> println("Spring")
        in 6..8 -> println("Summer")
        in 9..11 -> print("Fall")
        12, 1, 2 -> print("winter")
        !in 13 .. 14 -> print("Not 13 and 14")
        else -> print("Invalid")
    }

    //downTo keywords iterates value in reverse order


    var x : Any = 13.5f
    when(x) {
        is Int -> println("Int")
        is Float -> println("Float")
        else -> print("Not Int or FLoat")
    }

    //while loop
    var int = 1
    while (int < 10){
        println("val is $int ")
        int++
    }

    var a1= 100
    while (a1 > 1 ){
        if (a1 % 2 == 0) {
            println("Even decending $a1")
        }
        a1--
    }

    //For loop
    for (num in 1..10){
        println(num)
    }
    for (i in 5 downTo 1){
        println(i)
    }
    for (i in 1 until  5){
        //this prints 1 to 4
        println("******* $i")
    }

    for (i in 10 downTo 1 step 2){// same as i in 10.downTo(1).step(2)
        println("  $i")
    }

    //Write a for loop that runs from 0 to 10000
    //Once it's at 9001 it should write "IT'S OVER 9000!!!"
    var i = 0
    do {
        println(i)
        i++
    }while (i < 901)
    print("Its over")

    //break statemet and contiue
    for (i in 1..20) {
        //here 10/2 = 5 and 11/2 = 5.5 which is 5 interms of integer so skips both 10 and 11
        if (i/2 == 5) {
            //break
            continue
        }
        print(i)
    }
}

