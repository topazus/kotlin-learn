val systemUser: MutableList<Int> = mutableListOf(1, 2, 3)
val sudoers: List<Int> = systemUser

fun addSystemUser(newUser: Int) {
    systemUser.add(newUser)
}

fun getSystemSudoers(): List<Int> {
    return sudoers
}

fun main() {
    addSystemUser(4)
    println("total sudoers: ${sudoers.size}")
    getSystemSudoers().forEach {
        i -> println("some useful info on user $i")
    }
}