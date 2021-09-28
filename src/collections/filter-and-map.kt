fun main() {
    val num = listOf(1, -1, 4, -8)

    val positive = num.filter { i -> i > 0 }
    val negative = num.filter { it < 0 }

    val doubled = num.map { x -> x * 2 }
    val addTwo = num.map { it + 2 }

    val anyPositive = num.any { x -> x > 0 }
    val lessThanTen = num.all { it < 10 }
    val Even = num.none { it % 2 == 0 }
}