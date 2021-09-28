fun customPrint(str: String) {
    println(str.uppercase())
}

fun printNonNull(str: String?) {
    println("printing  \"$str\":")
    str?.let {
        print("\t")
        customPrint(it)
        println()
    }
}

fun printIfBothNonNull(str1: String?, str2: String?) {
    str1?.let { firstString ->
        str2?.let { secondString ->
            customPrint("$firstString: $secondString")
            println()
        }
    }
}

fun main() {
    val empty = "test".let {
        customPrint(it)
        it.isEmpty()
    }
    println(" is empty: $empty")

    printNonNull(null)
    printNonNull("my string")
    printIfBothNonNull("first", "second")
}