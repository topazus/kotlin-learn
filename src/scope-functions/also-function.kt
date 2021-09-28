data class Person(var name: String, var age: Int, var about: String) {
    constructor() : this("", 0, "")
}

fun writeCreaionLog(p: Person) {
    println("a new person ${p.name} was created")
}

fun main() {
    val jake = Person("jake", 30, "android developer")
        .also {
            writeCreaionLog(it)
        }

}