fun main(args: Array<String>) {
    testA()
    testB()
    testC()
    testD()
    testD1()
    testD2()
    testE()
    testE1()
    testF()
    testG()
    testH()
    Sample().test()
}

fun printA(body: () -> String) {
    println(body())
}
fun testA() {
    printA({ "리턴되는 값을 정의 A" })
}

////////////////////////////////////////////////////////////////////////////////////////////

fun printB(body: (String) -> String) {
    println(body("이걸 더해서"))
}

fun testB() {
    printB({ a -> "$a 리턴되는 값을 정의 B" })
}

////////////////////////////////////////////////////////////////////////////////////////////
fun printC(body: (String) -> String) {
    println(body("이걸 더해서"))
}

fun testC() {
    printC({
        // a -> 생략하고, it으로 대체
        "$it 리턴되는 값을 정의 C"
    })
}

////////////////////////////////////////////////////////////////////////////////////////////
fun printD(body: (String, String) -> String) {
    println(body("이걸 더해서", "이것도 더해서"))
}

fun testD() {
    printD({ a, b -> "$a $b 리턴되는 값을 정의 D" })
}
////////////////////////////////////////////////////////////////////////////////////////////

fun testD1() {
    printD { a, b -> "$a $b 리턴되는 값을 정의 D1" }
}

////////////////////////////////////////////////////////////////////////////////////////////
fun testD2() {
    printD(::printDparam)
}
fun printDparam(a: String, b: String): String {
    //val c: String = a + b + "리턴되는 값을 정의 D2"
    //val c: String = "$a $b 리턴되는 값을 정의 D2"
    return "$a $b 리턴되는 값을 정의 D2"
}

/////////////////////////////////////////////////////////////////////////////////////////////
fun testE() {
    printE({ a -> "$a 리턴되는 값을 정의 E " }, { b -> "$b BBBB" })
}

fun testE1() {
    printE({ a -> "$a 리턴되는 값을 정의 E1 " }) { b -> "$b BBBB" }
}

fun printE(body: (String) -> String, body2: (String) -> String) {
    println(body("이걸 더해서") + body2("이걸"))
}

/////////////////////////////////////////////////////////////////////////////////////////////
fun sample(a: String, b: String) = "$a $b 리턴되는 값을 정의"

fun testF() {
    printF { a, b -> sample(a, b) }
    printF(::sample)
}

fun printF(body: (String, String) -> String) {
    println(body("이걸 더해서", "이것도 더해서 F"))
}

/////////////////////////////////////////////////////////////////////////////////////////////
fun printG(body: (Int, Int) -> Int) {
    println(body(1, 2))
}

fun sumG(a: Int, b: Int) = a + b
fun minusG(a: Int, b: Int) = a - b
fun multiplyG(a: Int, b: Int) = a * b
fun divisionG(a: Int, b: Int) = a / b

fun testG() {
    printG(::sumG)
    printG(::minusG)
    printG(::multiplyG)
    printG(::divisionG)
}

/////////////////////////////////////////////////////////////////////////////////////////////
val higherOrder: () -> Unit = {
    println("Higher order functions")
}

fun testH() {
    higherOrder()
}

/////////////////////////////////////////////////////////////////////////////////////////////
class Sample {
    private lateinit var higherOrder: (String) -> Unit

    fun test() {
        higherOrder = {
            println("$it print higherOrder")
        }

        higherOrder("print message")
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////
