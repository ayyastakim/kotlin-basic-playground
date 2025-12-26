fun main() {
    /*
    * {keyword} {variabelName}: {DataType} = {value}
    * - keyword: ada dua yaitu var (mutable) dapat di-reassign dan val (mutable/read-only) tidak dapat di-reasign
    * - variableName: penamaan variable menggunakan camelCase (best practice)
    * - DataType: bisa disertakan (explicit) dan tidak (inferred type)
    * */

    var name: String = "john doe"
    val age: Int = 22

    println(name)
    println(age)

    name = "marrie" // variable name is mutable, dapat di-reassign
    println(name)

    // age = 25 // variable age is read only, cannot be reassigned

    // inferred type (tidak menyertakan tipe data secara langsung)
    val city = "las vegas"
    val company = "google"

    // rekomendasi: menggunakan immutable (val)
}