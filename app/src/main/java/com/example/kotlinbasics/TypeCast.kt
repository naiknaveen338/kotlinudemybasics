package com.example.kotlinbasics

fun main() {
    val list = listOf<Any>("naveen",2,"naik", 3)

    for (value in list) {
        if (value is String) {
            println("Type string $value")
        } else if (value is Int) {
            println("Type Int $value")
        } else {
            println("Type Unknown")
        }

        //Alternatively we can use like this
       /* when (value) {
            is String -> {
                println("Type string $value")
            }
            is Int -> {
                println("Type Int $value")
            }
            else -> {
                println("Type Unknown")
            }
        }*/
    }

    //SMart cast
    val obj1: Any = "I am naveen"
    if (obj1 is String) {
        //Object is automatically casted
        println("String ${obj1.length}")
    } else {
        println("Not string")
    }

    //Explicit unsafe casting using as keyword
    val str1 : String = obj1 as String
    println(str1)

    //This is throw error .ClassCastException
    val obj2: Any = 1211
   // val str2: String = obj2 as String
    //println(str2)

    //Explicit safe casting using "as?" keyword
    val obj3: Any = 1222
    val str3: String? = obj3 as? String
    println(str3)
}