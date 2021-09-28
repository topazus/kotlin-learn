

fun main() {
    data class Person(var name: String, var age: Int, var about: String) {
        constructor() : this("", 0, "")
    }

    val jake = Person()
    val stringDescription = jake.apply {
        name="jake"
        age=30
        about="android developer"
    }.toString()
    println(stringDescription)
}