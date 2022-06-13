package com.example.kotlinbasics

interface Drivable {
    val maxSpeed : Double
    fun drive() : String
    fun brake() {
        println("Break applied")
    }
}

open class Vehicle {

}

//To inherit Vehicle class it has to be open , else we cannot use inheritance in kotlin
//this is coz. all classes in kotlin are final by default .
//we can use sealed keyword to make prevent inheritance
open class Cars(val name : String, val brand: String, override val maxSpeed: Double) : Drivable{
    open var range : Double = 0.0;

    open fun drive(distance : Double) {
        println("Drove a car $distance Kms")
    }

    fun extendRange(range : Double) {
        this.range+= range
    }

    //same as below
    //override fun drive(): String = return "Interface drive"
    override fun drive(): String {
        return "Interface drive"
    }


}

//If we use inheritance , we shud use same parameter as that of parent for child class
//but we can add any other also along with name and brand here
class ElectricCar(maxSpeed: Double,name: String, brand: String, battery: Double) : Cars(name, brand, maxSpeed) {
    //To override varibale also make it open
    override var range = battery * 6

    //To override method make its parent method open
    override fun drive (distance: Double) {
        println("Drove $distance on electricity")
    }

    override fun drive(): String {
        return "interface electric car drive"
    }

    override fun brake() {
        super.brake()
        println("Brake applied in electric car")
      }


}

fun main() {
    val normalCars = Cars("B1","Audi", 170.0)
    val eCars = ElectricCar(190.0,"T1","Tesla",90.0, )
    eCars.drive(500000.0)

    //Polymorphism
    normalCars.drive(200.0)
    eCars.drive(100.0)

    eCars.extendRange(2.0)
    println("Range Ecars : ${eCars.range} NormalCars : ${normalCars.range} ")

    //calling interface method
    normalCars.brake()
    eCars.brake()
}