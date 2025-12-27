fun main() {
    /*
    * for loop di kotlin digunakan untuk melakukan iterasi terhadap iterator
    * iterator: array, range, collection (list, set, dan map)
    * berbeda dengan java, kotlin tidak mendukung for loop klasik -> for(init; condition, increment)
    * */

    // for loop dengan range (naik)
    for (i in 1..5) {
        print("$i ")
    }
    println()

    /// for loop dengan range (turun)
    for (i in 5 downTo 1) {
        print("$i ")
    }
    println()

    // for loop dengan range (step)
    for (i in 1..10 step 2) {
        print("$i ")
    }
    println()

    // for loop range tanpa angka terakhir, sering dipakai untuk indexing
    for (i in 1 until 5) {
        print("$i ")
    }
    println()

    // for loop dengan array
    val names = arrayOf('a', 'b', 'c', 'd', 'e')

    for (i in names ) {
        print("$i ")
    }
    println()

    // for loop dengan index
    for (i in names.indices) {
        println("$i : ${names[i]}")
    }
    println()

    // for loop menggunakan withIndex() -> best practice
    for ((index, value) in names.withIndex()) {
        println("$index : $value")
    }
    println()

    // for loop dengan collection
    val list = listOf("koltin", "java", "swift")

    for (i in 0 until list.size) {
        println(list.get(i))
    }
    println()

    // nested for loop
    for (i in 1..3) {
        for (j in 1..2) {
            println("i = $i, j = $j")
        }
    }
    println()

    // break and continue
    for (i in 1..5) {
        if (i == 2) continue
        if (i == 5) break
        print("$i ")
    }
    println()

    // labeled loop (unik di kotlin)
    for (i in 1..3) {
        loop@ for (j in 1..2){
            if (i == 2) break@loop
            println("i = $i, j = $j")
        }
    }
}