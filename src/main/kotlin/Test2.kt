fun main(args: Array<String>) {
    val abcde= StringBuilder().apply {
        for (abc in 'a'..'z'){
            append(abc)
        }
    }
    println("abcde = ${abcde}")
    println(";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;")

    val testList = ArrayList(listOf(1,2,4))
    println("testList = ${testList}")

    println(";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;")
    val squares = List(100) { (it + 1) * (it + 1) }//마지막인자가 함수이면 밖에정의할수있다
    val squares2 = List(100, { (it + 1) * (it + 1) })
    //println(squares)
    squares.filter { it < 100 }.forEach(fun(v:Int){ print(v.toString() + ",")})
    squares.filter { it < 100 }.forEach{ print(it.toString() +",")}
    squares.filter { it < 100 }.forEach{ el -> println(el)}
    println("....")
    squares.filter { it < 100 }.forEach(::println)
    println("....")
    squares.filter { it < 100 }.forEach(::testref)

    squares2.filter { it < 10 }.map { element -> element * 2 }.forEach{ println("10보다작은것중에곱하기2 $it")}

    println(";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;")

    val myTurtle = Turtle()
    with(myTurtle) { //100 pix 사각형 그리기
        penDown()
        for(i in 1..4) {
            forward(100.0)
            turn(90.0)
        }
        penUp()
    }

}

fun testref(i:Int )= println(i)

class Turtle {
    fun penDown() {}
    fun penUp() {}
    fun turn(degrees: Double) {}
    fun forward(pixels: Double) {}
}

