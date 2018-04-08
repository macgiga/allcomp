fun main(args: Array<String>) {
    for (dan in 2..9) {
        println("단수 = [$dan]")
        for (d in 1..9) {
            println(" $dan * $d  = ${dan * d}")//
        }
    }
    println("///////////////////////////////////////////////////")
    listOf(2,3,4,5,6,7,8,9).map { for ( i in 1..9) if (i != 9) println(" $it * $i  = ${it * i}") else println(" $it * $i  = ${it * i}\n" )}
    println("///////////////////////////////////////////////////")

    println(toJSON(listOf(1, 22, 3, 42, 555)))//
}

fun toJSON(collection: Collection<Int>): String {
    val sb = StringBuilder()
    sb.append("[")

    /*for ((i, cc) in collection.withIndex()) {
        sb.append(cc)

        if (i == collection.size - 1) {
            sb.append("")
        } else {
            sb.append(", ")
        }
    }*/

    collection.mapIndexed { idx, it -> if (idx == (collection.size-1) )sb.append(it.toString()) else sb.append(it.toString() + ",")}
    sb.append("]")

    println("collection = [${collection.joinToString(", ")}]")//
    return sb.toString()
}