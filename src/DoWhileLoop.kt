fun main() {
    /*
    * do-while loop akan menjalankan blok kode minimal 1 kali, lalu mengecek kondisi
    * kondisi dicek di akhir (post-test loop)
    * */

    var i = 1

    do {
        println("loop ke-$i")
        i++
    } while (i <= 5)

    // contoh kondisi langsung false di awal
    var x = 10

    do {
        println("dijalankan")
    } while (i <= 5)
}