package com.example.kotlinbasics

fun main() {
    var user = User(1, "naveen")
    println("user is ${user.name}")

    var user2 = User(1,"naveen")
    println(user.equals(user2))

    println(user)

    //only name is changed and copied
    val updatedUser = user.copy(name = "Hello")
    println(updatedUser.component1()) //prints 1
    println(updatedUser.component2()) // prints hello

    val (id1, name1) = updatedUser
    println("id is : $id1 and name is $name1")
}

data class User(val id : Int, val name : String)
