fun main() {
    val nilai = 75

    val result = when (nilai) {
            in 90..100 -> 'A'
            in 80..89 -> 'B'
            in 70..79 -> 'C'
            in 60..69 -> 'D'
            else -> 'E'
        }

    println("""
        nilai angka : $nilai
        grade huruf : $result
    """.trimIndent())

}