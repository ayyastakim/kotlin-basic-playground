fun main() {
    // operasi boolean: membandingan data dengan operator boolean (not equals, equals, and, or, in, is) berdasarkan true table

    // not: negasi/kebalikan dari suatu nilai boolean
    // and: bernilai true jika semua kondisi true
    // or: bernilai true jika salah satu kondisi true
    // xor: bernilai true jjika hanya salah satu kondisi true, tapi false jika keduanya sama

    val a = true
    val b = false

    println(a && b) // false
    println(a || b) // true
    println(!a) // false
    println(a.xor(b)) // true, xor di kotlin adalah built-in function

    // in: cek keanggotaan
    val numbers = listOf(1, 2, 3)

    println(2 in numbers)   // true
    println(5 !in numbers)  // true

    // is: cek tipe
    val obj: Any = "Hello"

    println(obj is String)   // true
    println(obj !is Int)     // true

    // operator boolean digunakan sebagai expression, bukan statement
    val x = 5
    val y = 3

    val result = if (x > y) "besar" else "kecil"
    println(result)

    // xor berikut bukan operasi logika, tetapi bitwise xor
    println(x xor y)    // 5 = 0101 xor 3 = 0011 -> 6 (0110)

    /*
    * catatan penting!!
    * koltin menggunakan short-circuit evaluation
    * and -> jika kiri false, kanan tidak dievaluasi
    * or -> jika kiri true, kanan tidak dievaluasi
    * */

    val z = 0
    if (z != 0 && 10 / z > 1) { // aman dari error division by zero
        println("aman")
    }

    val q = 0
    if (q == 0 || 10 / q > 1) { // aman dari error division by zero
        println("aman")
    }
}