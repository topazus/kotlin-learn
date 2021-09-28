import kotlin.reflect.KProperty

class Example {
    var p: String by Delegate()
    override fun toString(): String {
        return "example class"
    }
}

class Delegate() {
    operator fun getValue(thisRef: Any?, prop: KProperty<*>): String {
        return "$thisRef, thanks for delegating ${prop.name}"
    }
    operator fun setValue(thisRef: Any?, prop: KProperty<*>, value: String) {
        println("$value has been assigned to ${prop.name} in $thisRef")
    }
}

fun main() {
    val e = Example()
    println(e.p)
    e.p = "new"
}