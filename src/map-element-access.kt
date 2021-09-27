fun main() {
    val map = mapOf("key" to 11)
    val v1 = map["key"]
    val v2 = map["key2"]

    val v3 = map.getValue("key")

    val mapWithDefault = map.withDefault { k -> k.length }
    val v4 = mapWithDefault.getValue("key2")

    try {
        map.getValue("key3")
    } catch (e: NoSuchElementException) {
        println("error message: $e")
    }
}