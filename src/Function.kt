/*
* function adalah blok kode yang bisa dipanggil berulang kali untuk menjalankan tugas tertentu.
* manfaat:
* - menghindari duplikasi kode
* - kode lebih rapi & terstruktur
* - lebih mudah diuji dan dirawat
* sintaks dasar:
* fun namaFungsi(parameter: Tipe): ReturnType {
*   return nilai
* }
* */

// function -> menampilkan "teks hello kotlin!"
fun greet() {
    println("hello kotlin!")
}

fun main() {
    greet() // pemanggilan function
}