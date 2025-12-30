fun greet2(name: String = "user") {
    println("hello $name")
}

fun sayHello4(firstName: String, lastName: String? = null) {
    if (lastName == null) {
        println("hello $firstName")
    } else {
        println("hello $firstName $lastName")
    }
}

fun main() {
    greet2()
    greet2("mark")

    sayHello4("john")
    sayHello4("john", "doe")
}