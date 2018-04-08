fun main(args: Array<String>) {
    // public inline fun <S, T: S> Iterable<T>.reduce(operation: (acc: S, T) -> S): S
    val intList = listOf(1, 2, 3, 4, 5, 6)
    val intResult = intList.reduce { acc, it -> println("acc = $acc, it = $it")
        acc + it }

    println(intResult)

    println("-------------------------------")
    // public inline fun <S, T: S> Iterable<T>.reduceIndexed(operation: (index: Int, acc: S, T) -> S): S
    val intResult2 = intList.reduceIndexed{ idx, acc, it ->
        println("acc = $acc, it = $it, idx = $idx")
        if (idx == 1) acc else  acc + it }
    println(intResult2)


    println("-------------------------------")
    // public inline fun <S, T: S> List<T>.reduceRight(operation: (T, acc: S) -> S): S
    val strList = listOf("Jack", "Amos", "Peter", "Craig")
    val strResult = strList.reduceRight{ it, acc ->
        println("acc = $acc, it = $it")
        "$acc-$it"
    }
    println(strResult)


    println("-------------------------------")
    // public inline fun <S, T: S> List<T>.reduceRightIndexed(operation: (index: Int, T, acc: S) -> S): S {
    val strResult2 = strList.reduceRightIndexed{ idx, it, acc ->
        println("acc = $acc, index = $idx, it = $it")
        if(idx == 1) acc else "$acc-$it"
    }
    println(strResult2)

}