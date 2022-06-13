package com.example.kotlinbasics


fun main() {
    var human = Mammal.Human("naveen", "Dharwad", 79.0, 20.0).displayDetails()
}
// An abstract class cannot be instantiated
// (you cannot create objects of an abstract class).
// However, you can inherit subclasses from can them.
// The members (properties and methods) of an abstract class are non-abstract
// unless you explicitly use the abstract keyword to make them abstract.
abstract class Mammal(
    val name: String, val origin: String,
    val weight: Double) {

    // Abstract Property (Must be overridden by Subclasses)
    abstract var maxSpeed :  Double

    // Abstract Methods (Must be implemented by Subclasses)
    abstract fun run()
    abstract fun breath()

    // Concrete (Non Abstract) Method
    fun displayDetails() {
        println("Name: $name, Origin: $origin, Weight: $weight, " +
                "Max Speed: $maxSpeed")
    }

    class Human(name: String, origin: String, weight: Double, override var maxSpeed: Double) : Mammal(name, origin, weight) {
        override fun run() {
            println("Human run")
        }

        override fun breath() {
            println("Human breathe")
        }

    }


}