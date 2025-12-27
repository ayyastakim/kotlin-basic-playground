fun main() {
    /*
    * bentuk dasar if expression:
    if (kondisi) {
        // kode jika true
    } else {
        // kode jika false
    }
    * kondisi HARUS Boolean (tidak boleh angka)
    */

    val a = 6

    if (a > 10) {
        println("nilai a lebih besar dari 10")
    } else {
        println("nilai a kurang dari 10")
    }

    // else-if: jika lebih dari satu kondisi

    if (a > 10) {
        println("nilai a lebih besar dari 10")
    } else if (a > 5) {
        println("nilai a lebih besar dari 5 dan kurang dari 10")
    } else {
        println("nilai a kurang dari 10")
    }

    // if di-assign sebagai nilai variabel, wajib memiliki kondisi else!
    val result = if (a > 10) {
        println("nilai a lebih besar dari 10")
    } else {
        println("nilai a kurang dari 10")
    }

    // single expression, jika hanya memiliki satu kondisi/expression
    val result2 = if (a > 10) "lebih besar dari 10" else "kurang dari 10"
    println(result2)

}