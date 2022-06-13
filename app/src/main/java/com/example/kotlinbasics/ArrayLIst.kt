package com.example.kotlinbasics

fun main() {
    val aLIst = ArrayList<String>()
    aLIst.add("2")
    aLIst.add("4")

    val itr = aLIst.listIterator()
    while (itr.hasNext()){
        println(itr.next())
    }

    println(aLIst.get(0))
}