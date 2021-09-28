fun main() {
    val ls = listOf(1, 2, 3, 4)
    val oddEven = ls.partition { it % 2 != 0 }
    val (odd, even) = ls.partition { it % 2 != 0 }

    println("odd: ${oddEven.first}")
    println("even: ${oddEven.second}")

    val fruit = listOf("apple", "banana")
    val clothes = listOf("shirt", "jeans")
    val total = listOf(fruit, clothes)
    val map = total.map { it }
    val flatMap = total.flatMap { it }

    println("total: $total")
    println("map: $map")
    println("flatMap: $flatMap")
}