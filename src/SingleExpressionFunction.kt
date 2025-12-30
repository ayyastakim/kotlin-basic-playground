/*
* single expression function / expreesion body function:
* cara menyederhanakan function jika hanya berisikan kode blok sederhana,
* misal 1 baris / 1 expression
* */

fun square(x: Int): Int {
    return x * x
}

// single expression function
fun square2(x: Int): Int = x * x
fun sayHaiTo(name: String): Unit = println("hai $name")

// single expression function (inferred type)
fun square3(x: Int) = x * x

fun main() {
    println(square(2))
    println(square2(2))
    println(square3(2))
    sayHaiTo("koltin")
}