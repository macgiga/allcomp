data class Customer3(
        val name: String,
        val age: Int
)

fun main(args : Array<String>) {
    // I. any() vs none() methods
    println("-------------------any() method-------------------")
    // 1. with method signature:
    // public fun <T> Iterable<T>.any(): Boolean
    var simpleList = mutableListOf(1, 2, 3, 5, 6, 10)
    var check = simpleList.any()
    println("1.1 $check")
    /*
        true
    */
    check = simpleList.none()
    println("1.2 $check")
    /*
        false
    */

    simpleList.clear() // remove all elements of Kotlin List -> simpleList is empty.
    check = simpleList.any()
    println("1.3 $check")
    /*
        false
    */
    check = simpleList.none()
    println("1.4 $check")
    /*
        true
    */

    // 2. with method signature:
    // public inline fun <T> Iterable<T>.any(predicate: (T) -> Boolean): Boolean
    simpleList = mutableListOf(1, 2, 3, 5, 6, 10)
    check = simpleList.any { it -> it%3 == 0 } // 3
    println("2.1 $check")
    /*
        true
    */
    check = simpleList.none { it -> it%3 == 0} // 3
    println("2.2 $check")
    /*
        false
    */

    check = simpleList.any {it -> it % 7 == 0}
    println("2.3 $check")
    /*
        false
    */

    check = simpleList.none {it -> it % 7 == 0}
    println("2.4 $check")
    /*
        true
    */

    // II. all() method
    println("-------------------all() method-------------------")
    // Method signature:
    // public inline fun <T> Iterable<T>.all(predicate: (T) -> Boolean): Boolean
    check = simpleList.all{it -> it%2 == 0} // simpleList = [1, 2, 3, 5, 6, 10]
    println(check)
    /*
        false
    */
    simpleList = mutableListOf(2, 4, 6, 10, 12)
    check = simpleList.all{it -> it%2 == 0}
    println(check)
    /*
        true
    */

    // III. contains() method
    println("-------------------contains() method-------------------")
    check = simpleList.contains(2) // simpleList = [2, 4, 6, 10, 12]
    println("3.1 $check")
    /*
        true
    */
    check = simpleList.contains(3)
    println("3.2 $check")
    /*
        false
    */

    val customerList = listOf(
            Customer3("Smith", 26),
            Customer3("Peter", 43),
            Customer3("Mary", 27))

    check = customerList.contains(Customer3("Mary", 27))
    println("3.3 $check")
    /*
        true
    */

    check = customerList.contains(Customer3("Jack", 27))
    println("3.4 $check")
    /*
        false
    */
}