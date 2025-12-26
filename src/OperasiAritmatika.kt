fun main() {
    /*
    * operasi matematika digunakan untuk mengevaluasi antar nilai yaitu:
    * - penjumlahan (+), pengurangan (-), perkalian (*), pembagian (/), modulus/sisa hasil bagi (%)
    * */

    val a = 10
    val b = 3

    val penjumlahan = a + b
    println(penjumlahan)

    val pengurangan = a - b
    println(pengurangan)

    val perkalian = a * b
    println(perkalian)

    val pembagian = a / b
    println(pembagian)

    val modulus = a % b
    println(modulus)

    /*
    * inferred type variable, misalnya pembagian, secara default akan mengevaluasi nilai dengan tipe Int
    * maka, hasilnya bukan 3.3333 tetapi 3
    * jika ingin hasilnya bertipe floating point/decimal, maka perlu mengonversi ke float/double
    * */

    val pembagian2 = a.toDouble() / b.toDouble()
    println(pembagian2)

    val pembagian3 = 10.0 / 3.0
    println(pembagian3)

    /*
    * kotlin sama seperti java, sudah mendukung operasi matematika scientific / urutan operasi bilangan
    * */

    val result = 10 / 5
    println(result)

    val result2 = 10 + 10 / 2
    println(result2)

    val result3 = 2 * (10 + 5)
    println(result3)
}