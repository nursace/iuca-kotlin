package kg.iuca.oop

class Car(
    val brand: String,
    val color: String,
    val speed: Int,
)

fun main() {
    val bmw = Car("BMW", "red", 120)
    println(bmw.brand)
    println(bmw.color)
    println(bmw.speed)

    val toyota = Car("Toyota", "yellow", 80)
    println(toyota.brand)
    println(toyota.color)
    println(toyota.speed)
}