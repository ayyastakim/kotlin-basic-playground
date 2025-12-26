fun main() {
    /*
    * jika ingin membuat kumpulan data angka terurut gunakan range
    * range lebih efisien dibanding array, terutama jika jumlah datanya besar
    * range digunakan pada control flow looping
    * */

    val range = 1..100          // range angka 1 ke 100
    val range2 = 100 downTo 1   // penurunan range angka 100 ke 1

    println(range.count())          // mengambil jumlah data
    println(range.contains(50))     // mengecek suatu data dalam range, return boolean
    println(range.contains(200))    // mengecek suatu data dalam range, return boolean
    println(range.first)            // mengambil data pertama
    println(range.last)             // mengambil data terakhir
    println(range.step)             // kelipatan tiap kenaikan/penurunan data

    val range3 = 1..100 step 2          // kelipatan 2 dari range 1 sampai 100
    val range4 = 100 downTo 1 step 5    // penurunan kelipatan 5 dari range 100 sampai 1

    println(range4.count())          // mengambil jumlah data
    println(range4.contains(50))     // mengecek suatu data dalam range, return boolean
    println(range4.contains(200))    // mengecek suatu data dalam range, return boolean
    println(range4.first)            // mengambil data pertama
    println(range4.last)             // mengambil data terakhir
    println(range4.step)             // kelipatan tiap kenaikan/penurunan data
}