package com.example.kotlinbasics

fun main() {
    val childObj = Child()
    
    Child2()
}

open class Parent {
    public var h = 33
    protected var i : Int = 5
    private var j = 3
    internal var k = 10
    protected open fun doSOmething() {

    }
}

class Child : Parent() {
    //Here i is directly accessible

    init {
        h = 5
        k =4
        i = 6
        println("$i , $k, $h")
    }
}

class Child2 : Parent() {
    init {
        println(i)
    }

}

