fun main(args: Array<String>) {
    val isPositive = fun(num: Int): Boolean = num > 0
    println("isPositive(10) = ${isPositive(10)}")

    val returnAny =  {
        "retyrnAny" as Any
    }

    val returnAnyTest = fun(): Any = "returnAnyTest"

    println("returnAny = ${returnAny()}")
    println("returnAny2 = ${returnAnyTest()}")
}