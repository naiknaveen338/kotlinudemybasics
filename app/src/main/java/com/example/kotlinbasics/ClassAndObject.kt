package com.example.kotlinbasics

import java.lang.IllegalArgumentException

fun main() {
    println("Main Function")
    val naveen: Person = Person("naveen")
    naveen.hobby = "Play game"
    naveen.stateHobby()

    Person("naik",22).stateHobby()

    //THrows exception coz.set condition
    //Car().maxSpeed = 0

    println("My brand is ${Car().myBrand} and color ${Car().color} Max speed : ${Car().maxSpeed}")
}

//Here constructor is optional to declare
class Person constructor(name:String) {
    //Member variable
    var hobby : String = "Watch netflix"

    //If we dont want to initialize here , we need to mention in lateinit
    lateinit var job : String

    //Here age can be null 
    var age : Int? = null

    //Member secondary constructor
    constructor(name: String, age : Int) : this(name) {
        this.age = age
        println("Secondary Constructor called ***********")
    }


    //Every class can have init , It is an initializer ,
    //whenever Person object is created , it will run init block also
    init {
        //Here name is shadowed
        //Why kotlin allows to declare variable as same name as parameter inisde method ?
        //This is called shadowing and it is used to decouple code from other parts of the system.
        //It is possible coz.names are bound to current scope
        //Once shadowed there is no way to use the actual parameter unless it is assigned to some other variable
        //Here in this example cannot access name "naveen"
        //This shadowing is there in java as well . . in constructor we can declare this.name = name
        val name = "naik"
        println("Person creayted name : $name")
        Car()
        Car("hi")
        Car(brand = "Benz")

        this.job = "ENgineer"

        //accessing private setter
       // Car().myModel = "m5"
        println("Init called ***********")

    }

    fun stateHobby() {
        println("My hobby is $hobby age is  : $age")
    }
}

//Here blue and Audi are default value for constructor
//We can call Car() instead of Car("x","y")
class Car (color:String = "blue", brand:String = "Audi") {
    var myBrand : String = "BMW"

    var color : String = "ORANGE"

    //Custom getter
    //Who ever access the field will get lowercase of that field
    //Shuold be string in this case , if we declare int variable it will throw error
    get() {
        return field.lowercase()
    }

    //setter
    var maxSpeed : Int = 200
    set(value) {
        field = if (value > 0) value else throw IllegalArgumentException("Value should be greater than zero")
    }

    //private setter
    var myModel : String = "M5"
    private set

    init {
        println("Car created color : $color Brand : $brand")
    }


}