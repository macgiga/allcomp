fun main(args: Array<String>) {
    val str = "JavaSampleApproach.com = Be Kotlineer - Be Simple - Be Connective"

    val separate1 = str.split("=|-".toRegex())
    println(separate1)

    val separate2 = str.split(" = "," - ")
    println(separate2)
}