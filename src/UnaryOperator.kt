fun main() {
    // negatif dan positif
    val a = -10
    println(a)

    val b = +10 // initialize nilai positif secara eksplisit
    println(b)
    val c = 10  // best practice: default, tanpa menambahkan tanda +
    println(c)

    // not operation /negasi / kebalikan dari suatu boolean value
    val d = true
    println(!d)

    /*
    * increment dan decrement:
    * post-increment (x++): nilai awal digunakan, lalu penambahan 1
    * pre-increment (++x): penambahan 1 dulu, lalu digunakan
    *
    * post-decrement (x--): nilai awal digunakan, lalu pengurangan 1
    * pre-derement (--x): pengurangan 1 dulu, lalu digunakan
    * */

    // post-increment
    var x = 5
    println(x++)    // 5
    println(x)      // 6

    // pre-increment
    var y = 5
    println(++y)    // 6
    println(y)      // 6

    // post-decrement
    var i = 5
    println(i--)    // 5
    println(i)      // 4

    // pre-decrement
    var j = 5
    println(--j)    // 4
    println(j)      // 4
}