fun main(args: Array<String>) {
    val tarray = Array(5, ::initA).forEach(::addPrint)
    val tarray2 = Array(5, { i -> i })
    for (aa in tarray2) {
        println("tarray2 = ${aa}")
    }
}

fun addPrint(i: Int) = println(i)

fun initA(i: Int): Int {
    println("i = ${i}")
    return i
}