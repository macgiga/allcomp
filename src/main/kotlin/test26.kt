//Kotlin – Compare Objects with Comparable Example

import kotlin.Comparable

data class Date(val year: Int, val month: Int, val day: Int) : Comparable<Date> {

    override fun compareTo(other: Date) = when {
        year != other.year -> year - other.year
        month != other.month -> month - other.month
        else -> day - other.day
    }

}

data class Productsam(val name: String, val releasedDate: Date) : Comparable<Productsam> {

    override fun compareTo(other: Productsam) = when {
        releasedDate < other.releasedDate -> -1
        releasedDate > other.releasedDate -> 1
        else -> 0
    }

}

fun main(args: Array<String>) {

    println("=== Check Date Comparision ===")
    val date1 = Date(2007, 6, 29)
    val date2 = Date(2010, 4, 3)

    val compResult1 = when {
        date1 < date2 -> "BEFORE"
        date1 > date2 -> "AFTER"
        else -> "WITH"
    }

    println(date1.toString() + " -- comes " + compResult1 + " -- " + date2.toString())

    println("=== Check Product Comparision ===")
    val product1 = Productsam("Tablet", Date(2010, 4, 3))
    val product2 = Productsam("Smartphone", Date(2007, 6, 29))

    val compResult2 = when {
        product1 < product2 -> "BEFORE"
        product1 > product2 -> "AFTER"
        else -> "WITH"
    }

    println(product1.name + " -- comes " + compResult2 + " -- " + product2.name)
}