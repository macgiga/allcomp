fun main(args: Array<String>) {
//확장함수
    val sum1 : Int.(num: Int) -> Int = {this+it}
    val sum2 : Int.(Int) -> Int = {this+it}
    println(1.sum1(2))
    println(1.sum2(2))

    val sum = fun Int.(num: Int): Int = this + num
    println(1.sum(2))

}