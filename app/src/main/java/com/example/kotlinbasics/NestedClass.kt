package com.example.kotlinbasics

class OuterClass {
    private var name : String = "MR.X"
    class NestedClass {
        var description : String = "Code inside nested class"
        private var id : Int = 100
        fun foo () {
            println(id)
            //println(name) cannot access outerclass member
        }

    }

    inner class InnerClass {
        var description : String = "Code inside nested class"
        private var id : Int = 100
        fun foo () {
            println(id)
            println(name) //Can access outer class name here , even private field can be accessed
        }

    }
}

fun main() {
    println(OuterClass.NestedClass().description)

}