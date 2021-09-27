fun main() {
    val words = listOf("one", "two", "three")

    val firstWord = words.find { it.startsWith("o") }
    val lastWord = words.findLast { it.endsWith("e") }
    val something = words.findLast { it.contains("r") }
    val nothing = words.findLast { it.contains("a") }

    println("the first word start with \"o\" is \"$firstWord\"")
    println("the last word start with \"e\" is \"$lastWord\"")
    println("the last word contains \"r\" is ${something?.let { "\"$it\"" } ?: "null"}")
    println("the last word contains \"a\" is ${nothing?.let { "\"$it\"" } ?: "null"}")

    val nums = listOf(1, 1, 2, 4, 5, 8)
    val first = nums.first()
    val last = nums.last()
    val firstEven = nums.first { it % 2 == 0 }
    val lastOdd = nums.last { it % 2 != 0 }

    val empty = emptyList<Int>()
    val first2 = empty.firstOrNull()
    val last2 = empty.lastOrNull()
    val firstA = words.firstOrNull { it.contains("a") }
    val lastO = words.lastOrNull { it.endsWith("o") }

    val totalCount = nums.count()
    val evenCount = nums.count { it % 2 == 0 }
    
}