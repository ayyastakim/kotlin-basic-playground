fun main() {
    /*
    * - array adalah tipe data berupa kumpulan data dengan type yang sama
    * - data dalam array disimpan berurutan dan diakses dengan indexing
    * - ukuran/jumlah data dalam array tidak dapat diubah (mutable)
    * - built-in function: size, get(index), [index], set(index, value), [index] = value
    * */

    val name: Array<String> = arrayOf("jack", "john", "lary")

    // mengambil ukuran (jumlah data) array
    println(name.size)

    // mengambil data array dengan index
    println(name.get(0))
    println(name[0])

    // mengubah data array dengan index
    name.set(2,"marie")
    println(name.get(2))
    name[2] = "lary"
    println(name[2])

    // println(name.get(5)) // error: mengakses data diluar index maksimum yaitu 3

    /*
    * array tidak dapat di-initialize dengan data null karena ukurannya tidka dapat diubah
    * gunakan nullable type jika ingin meng-initialize dengan null
    * nullable type: tipe data dideklarasikan dengan {TipeData}?
    * akses dengan nama variable array diikuti tanda (?): {variableName}?
    * */
    val members: Array<String?> = arrayOfNulls(5)
    members.set(0, "lenna")
    members.set(1, null)
    members[2] = "taylor"
    members[3] = "sofia"
    members[4] = null

    println(members.get(1))
    println(members[4])
}

/*
* notes: val variableName: Array<DataType> = arrayOf(value)
* val tidak berarti immutable object
* val = referensi tidak bisa diganti
* Isi objek masih bisa berubah jika objeknya mutable
* Array adalah mutable
* */