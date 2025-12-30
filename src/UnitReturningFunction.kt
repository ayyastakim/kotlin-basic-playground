/*
* function memiliki 2 jenis:
* - tidak mengembalikan nilai (non-return type) -> Unit
* - mengembalikan nilai (return type) -> data type (Int, String, dll)
* */

// non-return type function
fun sayHello5(name: String?): Unit {    // Default, function non-return type tidak wajib menyertakan keyword Unit
    if (name == null) {
        println("hello user")
    } else {
        println("hello $name")
    }
}

fun main() {
    sayHello5(null)
    sayHello5("john")
}