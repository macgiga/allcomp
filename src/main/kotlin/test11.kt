fun main(args: Array<String>) {
    val a = Array(6, { i -> (i * i) })
    val b = Array(6) { i -> (i * i) }
    for (i in a) {
        print(i.toString() + " a,")
    }
    println("\n ///////////////////////////////////////////////////////////////////")
    for (i in b) {
        print(i.toString() + " b,")
    }
    println("\n ///////////////////////////////////////////////////////////////////")
    val c = Array(6, ::arrayFun).forEachIndexed(fun(i,ii)= println("$i $ii"))
    val c1 = Array(6, ::arrayFun).forEachIndexed { index, i -> print("""$index $i c, """) }
    println("\n ///////////////////////////////////////////////////////////////////")
    val d = Array(6, { arrayFun(it) }).forEach { print(it.toString() + " d,") }

}

fun arrayFun(i: Int) = i * i