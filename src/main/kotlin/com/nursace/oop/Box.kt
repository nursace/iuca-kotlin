package com.nursace.oop

class Box {
    var n: Int = 0
}

fun main() {
    val x = Box()

    val y = x
    val z = y
    val k = z

    val p = Box()

    k.n = 99
    print(x.n)
}