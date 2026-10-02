package com.nursace.oop.inheritance

open class Animal(val name: String) {
    open fun speak() = "..."
}

class Dog(name: String) : Animal(name) {
    override fun speak() = "woof woof"
}

class Cat(name: String) : Animal(name) {
    override fun speak() = "mew mew mew"
}

class Mole(name: String, val wingsLength: Double) : Animal(name)

fun main() {

    val rex: Dog = Animal("Rex") as Dog // throws ClassCastException
    rex.speak()


    val mole: Animal = Mole("Shuboed", 3.14)
//    mole.wingsLength

    println(mole.speak())
}
