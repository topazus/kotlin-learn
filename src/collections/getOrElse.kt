fun main() {
    val list = listOf(13, 24)
    println(list.getOrElse(0) { 11 })
    println(list.getOrElse(4) { 23 })

    val map = mutableMapOf<String, Int?>()
    println(map.getOrElse("x") { 1 })

    map["x"] = 1
    println(map.getOrElse("x") { 1 })

    map["x"] = null
    println(map.getOrElse("x") { 1 })
}