fun main() {
    /*
    * augmented assignment merupakan proses simplifikasi evaluasi nilai, misal:
    * total = total + 10, versi augmented assignment: total += 10
    * */

    var number = 10

    number += 10
    println(number)
    number -= 10
        println(number)
    number *= 10
        println(number)
    number /= 10
        println(number)

    var total: Int = 0

    val hargaBarang1 = 100
    total += hargaBarang1
    println(total)

    val hargaBarang2 = 200
    total += hargaBarang2
    println(total)

    val hargaBarang3 = 300
    total += hargaBarang3
    println(total)

}