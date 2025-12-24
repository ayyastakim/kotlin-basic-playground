fun main() {

    /*
    * tipe data number:
    * - integer number: Byte, Short, Int (default type), Long
    * - floating point number: Float, Double (default type)
    * */

    var a: Byte = 30
    var b: Short = 120
    var c: Int = 2000
    var d: Long = 9000000L

    var e: Float = 10.10F
    var f: Double = 1456.6528

    println(a)
    println(f)

    /*
    * literals:
    * decimal (10)
    * hexadecimal (0xFAE8)
    * byte = (0b010101)
    * */

    var g: Int = 0b010101

    println(g)

    //underscore in number
    var h: Long = 1_000_000_000L
    println(h)

    // konversi tipe data

    var i: Int = 450000

    // Int to Long
    var iLong: Long = i.toLong()
    println(iLong)

    // Int to Double
    var iDouble: Double = i.toDouble()
    println(iDouble)

    // Int to Short
    var iShort: Short = i.toShort() // number of overflow (Short: -128 to 127)
    println(iShort)
}