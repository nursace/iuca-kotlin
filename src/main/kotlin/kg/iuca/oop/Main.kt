package kg.iuca.oop

fun main() {
    val a = Person()
    val b = Person()

    a.name = "Ada"
    b.name = "Grace"

    a.introduce()
    b.introduce()

    val cnt = Counter()
    cnt.inc()
    print(cnt.value)
}