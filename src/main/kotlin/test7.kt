fun main(args: Array<String>) {
    val sum = { x: Int, y: Int -> x + y}
    val sum2: (Int, Int) -> Int = { x, y -> x + y }
    println(sum(1,2))
    println(sum2(1,2))
    println("//////////////////////////////////////////////////////")

    val sumOptional = { x: Int, y: Int -> x + y}
    val sumFull: (Int, Int) -> Int = { x, y -> x + y }
    println("sumOptional(10, 15) = ${sumOptional(10, 15)}")
    println("sumFull(10, 20) = ${sumFull(10, 20)}")
    println("//////////////////////////////////////////////////////")

    val add: (Int) -> Int = { it + 1 }
    println("add(10) = ${add(10)}")
    println("//////////////////////////////////////////////////////")

    val isPositive: (Int) -> Boolean = {
        val isPositive = it > 0
        isPositive
    }
    val isPositiveTest: (Int) -> Boolean = number@ {
        val isPositive = it > 0
        return@number isPositive
    }
    println("isPositive(10) = ${isPositive(10)}")
    println("isPositiveTest(-10) = ${isPositiveTest(-10)}")

    println("//////////////////////////////////////////////////////")
}