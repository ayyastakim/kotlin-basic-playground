
fun fullName(firstName: String, middleName: String, lastName: String) {
    println("$firstName $middleName $lastName")
}

fun main() {
    // inisialisasi argument secara implisit -> wajib sesuai urutan parameter function
    fullName("susilo", "bambang", "yudhoyono")

    // named argument -> argument diinisialisasi secara eksplisit dengan nama parameter -> urutan parameter function tidak wajib
    fullName(lastName = "yudhoyono", firstName = "susilo", middleName = "bambang")
}