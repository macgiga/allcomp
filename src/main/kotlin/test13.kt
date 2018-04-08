//델리게이트 위임
import kotlin.reflect.KProperty

interface Base {
    fun printx()
}

class BaseImpl(val x: Int) : Base {
    override fun printx() {
        println(x)
    }
}

class Derived(d: Base) : Base by d {
    /*override fun printx() {
        println("abc")
    }*/
}

fun main(args: Array<String>) {
    val c = BaseImpl(10)
    Derived(c).printx() // 10 출력
println("////////////////////////////////////////////////////////")

    val e = Example()
    println(e.p)
}
class Example {
    var p: String by DelegateSample()
}

class DelegateSample {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return "$thisRef, thank you for delegating '${property.name}' to me!"
    }
    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        println("$value has been assigned to '${property.name} in $thisRef.'")
    }
}