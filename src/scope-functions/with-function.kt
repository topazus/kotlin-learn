class Configuration(var host: String, var port: Int)

fun main() {
    val config = Configuration("127.0.0.1", 22)
    with(config) {
        println("$host:$port")
    }

    println("${config.host}:${config.port}")
}