fun main() {
    /*
    * - operasi perbadingan: membandingkan dua buah data
    * - menghasilkan nilai boolean (true/false)
    * - jika operasi benar, maka keluaran: true
    * - jika operasi salah, maka keluaran: false
    * */
    val a = 10
    val b = 10

    val result = (a < b)
    println(result)

    val result2 = (a > b)
    println(result2)

    val result3 = (a <= b)
    println(result3)

    val result4 = (a >= b)
    println(result4)

    val result5 = (a == b)
    println(result5)

    val result6 = (a != b)
    println(result6)

    // membandingkan character -> dievaluasi berdasarkan nilai unicode
    println('a' > 'A') // true a = 97, b = 65
    println('b' > 'a') // true

    // membandingkan string -> dievaluasi urutan leksikografis (lexicographical order) berdasarkan Unicode tiap karakter
    println("apple" < "banana") // true: a vs b → 'a' < 'b' → selesai
    println("abc" < "abd") // true: a = a, b = b, c < d → true
    println("cat" < "cater") // true: string lebih pendek dianggap lebih kecil
    println("apple" == "Apple") // false: case sensitive -> 'a' (97), 'A' (65)
    println("apple" > "Apple")  // true: case sensitive -> 'a' (97), 'A' (65)

}