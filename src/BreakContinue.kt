fun main() {
    /*
    * break dan continue: keyword control flow yang digunakan di dalam loop (for, while, do-while).
    * break: menghentikan loop sepenuhnya dan keluar dari loop.
    * continue: melewati sisa kode di iterasi sekarang dan lanjut ke iterasi berikutnya.
    * */

    // break di for loop
    for (i in 1..5) {
        if (i == 4) break
        println("for loop $i")
    }
    println()

    // break di while loop
    var i = 0

    while (true) {
        if (i > 3) break
        println("while loop $i")
        i++
    }
    println()

    // continue di for loop
    for (i in 1..5) {
        if (i == 3) continue
        println("for loop $i")
    }
    println()

    // continue di while loop, perhatikan posisi incremental untuk update variable!
    var x = 0

    while (true) {
        x++ // selalu tempatkan increment sebelum continue agar value-nya diupdate
        if (x == 3) continue

        if (x > 5) break
        println("while loop $x")
    }
    println()

    // labeled break
    outer@ for (i in 1..3) {
        for (j in 1..3) {
            if (j == 2) break@outer // menghentikan loop luar, bukan loop dalam.
            println("i=$i j=$j")
        }
    }
    println()

    // labeled continue
    outer@ for (i in 1..3) {
        for (j in 1..3) {
            if (j == 2) continue@outer // melanjutkan ke iterasi berikutnya dari loop luar.
            println("i=$i j=$j")
        }
    }
}