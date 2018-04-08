data class Address(
        val street: String,
        val postcode: String
)

data class Customer2(
        val name: String,
        val age: Int,
        val address: Address
)

fun main(args: Array<String>) {
    println("-------------------------------1-----------------------------------")
    val customerList = listOf(
            Customer2("Jack", 25, Address("NANTERRE CT", "77471")),
            Customer2("Mary", 37, Address("W NORMA ST", "77009")),
            Customer2("Peter", 18, Address("S NUGENT AVE", "77571")),
            Customer2("Amos", 23, Address("E NAVAHO TRL", "77449")),
            Customer2("Craig", 45, Address("AVE N", "77587")),
            null)
    /////////////////////////////////////////////////////////////////////////////
    // 1. fun <T, R> Iterable<T>.map(transform: (T) -> R): List<R>
    /////////////////////////////////////////////////////////////////////////////

    customerList.map { it -> if (it != null) "${it.name} lives at street ${it.address.street}" else null }.forEach { println(it) }

    println("-------------------------------2-----------------------------------")
    /////////////////////////////////////////////////////////////////////////////
    // 2. fun <T, R, C : MutableCollection<in R>> Iterable<T>.mapTo(destination: C, transform: (T) -> R): C
    /////////////////////////////////////////////////////////////////////////////
    var strMutableCustList = mutableListOf<String>()
    customerList.mapTo(strMutableCustList, { it -> if (it != null) "${it.name} lives at street ${it.address.street}" else "The value may be null. Please check again!" })
    strMutableCustList.forEach { println(it) }

    println("-------------------------------3-----------------------------------")
    /////////////////////////////////////////////////////////////////////////////
    // 3. fun <T, R : Any> Iterable<T>.mapNotNull(transform: (T) -> R?): List<R>
    /////////////////////////////////////////////////////////////////////////////
    customerList.mapNotNull { it -> if (it != null) "${it.name} lives at street ${it.address.street}" else null }.forEach { println(it) }

    println("-------------------------------4-----------------------------------")
    /////////////////////////////////////////////////////////////////////////////
    // 4. fun <T, R : Any, C : MutableCollection<in R>> Iterable<T>.mapNotNullTo(destination: C, transform: (T) -> R?): C
    /////////////////////////////////////////////////////////////////////////////
    strMutableCustList.clear()
    customerList.mapNotNullTo(strMutableCustList, { it -> if (it != null) "${it.name} lives at street ${it.address.street}" else null })
    strMutableCustList.forEach { println(it) }

    println("-------------------------------5-----------------------------------")
    /////////////////////////////////////////////////////////////////////////////
    // 5. fun <T, R> Iterable<T>.mapIndexed(transform: (index: Int, T) -> R): List<R>
    /////////////////////////////////////////////////////////////////////////////
    customerList.mapIndexed { idx, it ->
        if (it != null)
            "[${idx}] ${it.name} lives at street ${it.address.street}"
        else "[${idx}] null"
    }.forEach { println(it) }

    println("-------------------------------6-----------------------------------")
    /////////////////////////////////////////////////////////////////////////////
    // 6. fun <T, R, C : MutableCollection<in R>> Iterable<T>.mapIndexedTo(destination: C, transform: (index: Int, T) -> R): C
    /////////////////////////////////////////////////////////////////////////////
    strMutableCustList.clear()
    customerList.mapIndexedTo(strMutableCustList, { idx, it ->
        if (it != null)
            "[${idx}] ${it.name} lives at street ${it.address.street}"
        else "[${idx}] null"
    })
    strMutableCustList.forEach { println(it) }

    println("-------------------------------7-----------------------------------")
    /////////////////////////////////////////////////////////////////////////////
    // 7. fun <T, R : Any> Iterable<T>.mapIndexedNotNull(transform: (index: Int, T) -> R?): List<R>
    /////////////////////////////////////////////////////////////////////////////
    customerList.mapIndexedNotNull { idx, it ->
        if (it != null)
            "[${idx}] ${it.name} lives at street ${it.address.street}"
        else null
    }.forEach { println(it) }

    println("-------------------------------8-----------------------------------")
    /////////////////////////////////////////////////////////////////////////////
    // 8. fun <T, R : Any, C : MutableCollection<in R>> Iterable<T>.mapIndexedNotNullTo(destination: C, transform: (index: Int, T) -> R?): C
    /////////////////////////////////////////////////////////////////////////////
    strMutableCustList.clear()
    customerList.mapIndexedNotNullTo(strMutableCustList, { idx, it ->
        if (it != null)
            "[${idx}] ${it.name} lives at street ${it.address.street}"
        else null
    })
    strMutableCustList.forEach { println(it) }
}
