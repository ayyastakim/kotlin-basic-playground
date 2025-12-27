fun main() {
    /*
    * - when expressiom adalah pengganti switch-case di java, versi lebih ringkas
    * - when tidak menggunakan brake dan continue
    * - digunakan untuk mengecek/matching suatu nilai
    * */

    // bentuk dasar
    val nilai = 2

    when (nilai) {
        1 -> println("satu")
        2 -> println("dua")
        3 -> println("tiga")
        else -> println("tidak dikenal")
    }

    // when sebagai expression/ di-assign ke sebuah variable, wajib sertakan else!
    val result = when (nilai) {
        1 -> println("satu")
        2 -> println("dua")
        3 -> println("tiga")
        else -> println("tidak dikenal")
    }

    // multiple condition
    when (nilai) {
        1, 3, 5 -> println("bilangan ganjil")
        2, 4, 6 -> println("bilangan genap")
        else -> println("undifined!")
    }

    // when dengan in (mengecek keanggotaan)
    val members: Array<Int> = arrayOf(10, 20, 30, 40)
    val value = 50

    when (value) {
         in members -> println("member of array")
        !in members -> println("member of array")
    }

    // when dengan is (mengecek type)
    val type: Any = "123"

    when (type) {
        is Int -> println("Int")
        is String -> println("String")
        else -> println("unknow!")
    }

    // when dengan range
    val number = 87

    when (number) {
        in 90..100 -> println("A")
        in 80..89 -> println("B")
        in 70..79 -> println("C")
        else -> println("D")
    }

    // when without argument
    when {
        number > 90 -> println("sangat baik")
        number > 75 -> println("baik")
        number > 60 -> println("cukup baik")
        else -> println("kurang")
    }




}