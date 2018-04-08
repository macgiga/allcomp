fun main(args: Array<String>) {

    val items = listOf("apple", "banana", "kiwi")
    for (item in items) {
        println(item)//
    }

    println("////////////////////////////////////////////////////////////")

    val items2 = listOf("apple2", "banana2", "kiwi2")
    for (index in items2.indices) {
        println("item2 at $index is ${items2[index]}")//
    }

    val items3 = listOf("apple3", "banana3", "kiwi3")
    var index3 = 0
    while (index3 < items3.size) {
        println("item3 at $index3 is ${items3[index3]}")//
        index3++
    }

    println("////////////////////////////////////////////////////////////")
    val x = 10
    val y = 9
    if (x in 1..y + 1) {
        println("fits in range $x $y")//
    }

    println("////////////////////////////////////////////////////////////")

//  !in 연산자를 사용해서 숫자가 범위를 벗어나는지 검사한다:
    val list = listOf("a", "b", "c")
    if (-1 !in 0..list.lastIndex) {
        println("-1 is out of range ${list.lastIndex}")//
    }
    if (list.size !in list.indices) {
        println("list size is out of valid list indices range too ${list.indices} ${list.size}")//
    }

    println("////////////////////////////////////////////////////////////")

    for (kk in 1..10 step 2) {
        println(kk)//
    }

    println("////////////////////////////////////////////////////////////")

    for (s in 9 downTo 0 step 3) {
        println(s)//
    }

    println("////////////////////////////////////////////////////////////")

    //   in 연산자로 콜렉션이 객체를 포함하는지 검사: "apple", "banana", "kiwi"
    when {
        "orange" in items -> println("juicy")//
        "apple" in items -> println("apple is fine too")//
    }
    println("////////////////////////////////////////////////////////////")

    val fruits = listOf("ab", "a", "ca")
    fruits.filter { it.startsWith("a") }
            .sortedBy { it }
            .map { it.toUpperCase() }
            .forEach { println(it) }
    println("////////////////////////////////////////////////////////////")

    val list2 = listOf(1, 3, 4, 5, 0, -1)
    val positives = list2.filter { it > 0 }
    println(positives)//
    println("////////////////////////////////////////////////////////////")

    val testMap = mapOf(1 to "one", 2 to "two")
    for ((k, v) in testMap) {
        println("$k -> $v")//
    }
    println("////////////////////////////////////////////////////////////")
    println(maxOfTest(2, 3))
    println("////////////////////////////////////////////////////////////")

    println(describe("2"))
}

//식 몸체(expression body)를 사용하고 리턴 타입을 추론
fun maxOfTest(a: Int, b: Int) = if (a > b) a else b

fun describe(obj: Any): String =
        when (obj) {
            1 -> "One"
            "Hello" -> "Greeting"
            is Long -> "Long"
            !is String -> "Not a string"
            else -> "Unknown"
        }

//DTO 생성 (POJO/POCO)
data class Customer(val name: String, val email: String)


