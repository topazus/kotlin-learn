import kotlin.math.abs

fun main() {
    val ls = listOf(-3, 2, 5, 4)
    val empty = emptyList<Int>()

    val min = ls.minOrNull()
    val max = ls.maxOrNull()
    val emptyMin = empty.minOrNull()
    val emptyMax = empty.maxOrNull()

    val natural = ls.sorted()
    val inverted = ls.sortedBy { -it }
    val descended = ls.sortedDescending()
    val descendedBy = ls.sortedByDescending { abs(it) }

    println("natural: $natural")
    println("inverted: $inverted")
    println("descended: $descended")
    println("descendedBy: $descendedBy")
}