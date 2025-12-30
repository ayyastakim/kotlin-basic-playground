
fun sayHello(name: String) {
    println("hello $name")
}

fun sayHello2(firstName: String, lastName: String) {
    println("hello $firstName $lastName")
}

fun sayHello3(firstName: String, lastName: String?) {
    if (lastName == null) {
        println("hello $firstName")
    } else {
        println("hello $firstName $lastName")
    }
}

fun main() {
    sayHello("koltin")

    sayHello2("john", "doe")

    sayHello3("jean", null)
    sayHello3("jean", "doe")
}