fun main(args: Array<String>) {
    println(apply2("Kim", { increase2(3) }))
    println(apply3("Kim", ::increase3))
}

fun apply2(name: String, body: (Int) -> Int): Int {
    println("name $name")
    return body(0)
}

fun apply3(name: String, body: (Int) -> Int): Int {
    println("name $name")
    return body(3)
}

fun increase2(num: Int): Int {
    println("num $num")
    return num + 10
}


fun increase3(num: Int): Int {
    println("num $num")
    return num + 10
}

