fun main(args: Array<String>) {

    val input: String = "One, Two, Three, Four"

    println("=== String into List ===")
    var result: List<String> = input.split(",").map { it.trim() }

    result.forEach { println(it) }



    val result2 = listOf("One", "Two", "Three", "Four")
    println(result2)

    println("=== List into String ===")
    val output = result2.joinToString("|", prefix = "<", postfix = ">", limit = 3, truncated = "...more...")

    println(output)
}