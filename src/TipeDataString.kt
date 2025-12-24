fun main() {
    var firstName: String = "ayyas"
    var lastName: String = "takim"
    var address2: String = """
        pettarani no.86 street,
        makassar city
        indonesia
    """

    // mengabaikan indentasi dari string lebih dari sebaris
    var address: String = """
        pettarani no.86 street,
        makassar city
        indonesia
    """.trimIndent()

    // mengabaikan indentasi dengan default character (pipe)
    var address3: String = """
        |pettarani no.86 street,
        |makassar city
        |indonesia
    """.trimMargin()

    // mengabaikan indentasi dengan karakter khusus yang diberikan
    var address4: String = """
        >pettarani no.86 street,
        >makassar city
        >indonesia
    """.trimMargin(">")

    println(address)
    println(address2)
    println(address3)
    println(address4)

    // menggabungkan string dengan concatenation
    var fullName: String = firstName + " " + lastName
    println(fullName)

    // menggabungkan string dengan template
    var fullNameConcat: String = "$firstName $lastName"
    println(fullNameConcat)

    // menggabungkan string dengan template dengan data/variabel yang dievaluasi
    var fullNameLength: String = "$fullName memiliki ${fullName.length} karakter"
    println(fullNameLength)

}