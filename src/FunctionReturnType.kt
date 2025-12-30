// return type function
fun add(a: Int, b: Int): Int {  // wajib mendeklarasikan tipe data function
    val result = a + b
    return result   // wajib mengembalikan nilai suatu expression dengan keyword return
}

// return keyword bisa dicustom
fun divison(a: Int, b: Int): Int {
    if (b == 0) {
        return 0
    } else {
        val result = a / b
        return result
    }
}

fun main() {
    println(add(2, 3))

    val result = add(2, 8)
    println(result)

    val result2 = divison(10, 2)
    println(result2)

    println(divison(10, 5))
    println(divison(10, 0))
}