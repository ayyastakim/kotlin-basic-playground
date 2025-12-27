fun main() {
    /*
    * kotlin secara default mewajibkan untuk meng-initialize nilai dari sebuah variable (non-null type)
    * jika nilainya memiliki dua situasi (ada/tida ada), gunakan nullable type: {DataType}?
    * gunakan elvis operator (?) untuk null handling
    * */

     // var name: String = null  // error: null tidak dapat di-aasign sebagai non-null type (String)

    var name: String? = null // null dapat di-assign sebagai nullable type (String?)

    println(name?.length) // cara akses nullable type

    name = "john"

    println(name.length)
}