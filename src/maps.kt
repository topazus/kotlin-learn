const val ADD = 10
val EZPassAccounts: MutableMap<Int, Int> = mutableMapOf(1 to 10, 2 to 20)
val EZPassReport: Map<Int, Int> = EZPassAccounts

fun updateAccount(id: Int) {
    if (EZPassAccounts.containsKey(id)) {
        println("updating id $id")
        EZPassAccounts[id] = EZPassAccounts.getValue(id) + ADD
    } else {
        println("id $id does not exist")
    }
}

fun accountReport() {
    println("account report:")
    EZPassReport.forEach { k, v -> println("$k -> $v") }
}

fun main() {
    accountReport()
    updateAccount(1)
    updateAccount(1)
    updateAccount(6)
    accountReport()
}