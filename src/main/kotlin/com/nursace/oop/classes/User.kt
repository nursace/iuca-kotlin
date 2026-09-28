package com.nursace.oop.classes

//class User {
//    var id: Int = 0
//    var name: String = ""
//
//    constructor(id: Int, name: String) {
//        this.id = id
//        this.name = name
//    }
//}

class User(val id: Int, var name: String, var age: Int) {
    init {
        println("User age is $age")
        require(name.isNotBlank()) {
            "Name must not be blank"
        }
    }
}

fun main() {
    val user = User(4552, "John", 35) // No value passed for parameter 'id'.

    user.id
    user.name

    user.age

}

