fun main() {
    val A = listOf("a", "b")
    val B = listOf(1, 2, 3)

    val resultPair = A zip B
    val resultReduce = A.zip(B) { a, b -> "$a$b" }

    println("A to B: $resultPair")
    println("\$A\$B: $resultReduce")
}