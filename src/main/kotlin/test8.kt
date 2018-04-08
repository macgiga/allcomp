fun main(args: Array<String>) {
    getName1({ setCommon1() })
    getName1(::setCommon1)
}

fun setCommon1(): String {
    return "My name is "
}

fun getName1(body: () -> String) {
    println(body())
}