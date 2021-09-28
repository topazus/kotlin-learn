// A set is an unordered collection that does not support duplicates.
val fruits: MutableSet<String> = mutableSetOf("apple", "banana")

fun addFruit(newFruit: String): Boolean {
    return fruits.add(newFruit)
}

fun isAdded(status: Boolean): String  {
    return if (status) "added successfully" else "it is duplicate"
}

fun main() {
    val res1 = isAdded(addFruit("watermelon"))
    val res2 = isAdded(addFruit("apple"))
    println(res1)
    println(res2)
}