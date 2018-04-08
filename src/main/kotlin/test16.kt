fun main(args: Array<String>) {
    listOf(1,2,3,4,5).filter(fun(item) = item > 3 ).forEach(::println)
    listOf(1,2,3,4,5).filter{it > 3}.forEach(::println)
println("//////////////////////////////////////////////")
    val sam = fun Int.(other:Int) = this + other
    println(3.sam(2))

println("//////////////////////////////////////////////")
  /*  val oddLength = compose(::isOdd, ::length)
    val strings = listOf("a", "ab", "abc")
    println(strings.filter(oddLength)) // "[a, abc]" 출력*/
}

open class A { // 암묵적으로 @A 라벨 사용
    inner class B { // 암묵적으로 @B 라벨 사용
        fun Int.foo() { // 암묵적으로 @foo 라벨 사용
            val a = this@A // A의 this
            val b = this@B // B의 this
            val c = this // foo()의 리시버인 Int
            val c1 = this@foo // foo()'의 리시버인 Int
            val funLit = lambda@ fun String.() {
                val d = this // funLit의 리시버
            }
            val funLit2 = { s: String ->
                // 둘러싼 람다식에 리시버가 없으므로
                // foo()의 리시버
                val d1 = this
            }
        }
    }
}

fun length(s: String) = s.length

