/*
* constant variable:
* - variabel yang sifatnya immutable untuk dpat diakses secara global (dimana saja)
* - keywordnya harus val dan tidka dapat dideklarasi di dalam fucntion atau class (local variable)
* - best practice: penamaan menggunakan uppercase dan underscore untuk spasi: UPPER_CASE
* */

 const val MY_APPLICATION = "kotlin basic for beginner"
 const val VERSION = "1.0.0"

fun main() {

    // const val MY_APPLICATION = "kotlin basic for beginner"   // error cause local variable
    // const val VERSION = "1.0.0"  // error cause local variable

    println("app: $MY_APPLICATION version: $VERSION")

}