package kg.iuca

fun printNum(n: Int) {
    println(n)
}

fun main() {

    val x = printNum(10)
    println(x)

//    val s = operate(7, 14) { x, y ->
//        x + y
//    }
//
//    val p = operate(7, 14) { x, y ->
//        x * y
//    }
//
//    val d = operate(7, 14) { x, y ->
//        x / y
//    }

//    greet(name = "Citizen")
//    greet(name = "Martinez", greeting = "Hola")

}

fun square(x: Int): Int {
    return x * x
}

fun square2(x: Int) = x * x

fun greet(name: String, greeting: String = "Hello") {
    println("$greeting, $name!")
}

fun operate(x: Int, y: Int, op: (Int, Int) -> Int): Int {
    return op(x, y)
}
