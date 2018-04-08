fun main(args: Array<String>) {
    println("1+1 = ${1 + 1}")//

    "abcd".map { it.toUpperCase() }.forEach(::println)//

    val memberlist = listOf(1,2,3,4,5,6)
    println(memberlist.any { it > 4 })
    println(memberlist.all { it > 4 })
    println(memberlist.count { it > 4 })
    println(memberlist.find { it > 4 })


    val total = listOf(1, 2, 3, 4, 5).fold(0, { total, next -> total + next })
    println("total: $total")

    val mul = listOf(1, 2, 3, 4, 5).fold(1, { mul, next -> mul * next })
    println("mul: $mul")

    val productList = listOf(
            Product("A", 100),
            Product("B", 200),
            Product("C", 300),
            Product("D", 400),
            Product("E", 500)
    )

    val quantity = productList.map { it.quantity }.fold(0, { atotal, next -> atotal + next })
    println("quantity: $quantity")

    val productMap = mapOf(
            "a" to Product("A", 100),
            "b" to Product("B", 200),
            "c" to Product("C", 300),
            "d" to Product("C", 400),
            "e" to Product("C", 500)
    )

    val quantitymap = productMap.map { it.value.quantity }.fold(0, { btotal, next -> btotal + next })
    println("quantitymap: $quantitymap")
}
data class Product(val name: String, val quantity: Int) {
}