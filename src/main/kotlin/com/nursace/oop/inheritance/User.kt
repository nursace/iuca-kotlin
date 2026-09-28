package com.nursace.oop.inheritance

open class User(
    final val id: Int,
    open var name: String
) {

    open fun describe() {
        println("User name is $name and id is $id")
    }
}