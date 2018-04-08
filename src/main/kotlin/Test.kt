typealias OscarWinners = Map<String, String>
fun countLaLaLand(oscarWinners: OscarWinners) = oscarWinners.count()
fun countLaLaLand2(oscarWinners: OscarWinners) = oscarWinners.count { it.value.contains("La La Land") }
// 타입 이름(초기와 타입 별칭)을 상호사용할 수 있다:
fun checkLaLaLandIsTheBestMovie(oscarWinners: Map<String, String>) = oscarWinners["Best picture"] == "La La Land"

fun main(args: Array<String>) {
    println(";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;")
    println(countLaLaLand(mapOf("1" to "La La Land", "2" to "land", "3" to "no", "4" to "La La Land")))
    println(countLaLaLand2(mapOf("1" to "La La Land", "2" to "land", "3" to "no", "4" to "La La Land")))
    println(checkLaLaLandIsTheBestMovie(mapOf("1" to "La La Land", "2" to "land", "3" to "no", "Best picture" to "La La Land")))

    println(";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;")

    //문자가 포함된거 걸러네기
    val numberRegex = "\\d+".toRegex()
    val numbers = listOf("abc", "123", "456", "2a").filter(numberRegex::matches)
    val numbers2 = listOf("abc", "123", "456", "2a").filter{numberRegex.matches(it)}
    println(numbers)
    println(numbers2)

    println(";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;")

    var testMap= mapOf(1 to "one", 2 to "two")
    println( testMap.mapValues { (key, value) -> "키 $key -> 값 $value! 합친거 값에넣기" })
    println(testMap)
    //첫번쨰 파라미터 넣지않기
    testMap.forEach { _, value -> println("$value") }

    println(";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;")

    val aList = arrayListOf(1,2,3)
    aList.forEach{value -> println(value)}
    aList.forEach{println(it)}
    aList.forEach(::println)
    println("aList = ${aList}")

    println(";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;")
    val str = arrayListOf("a","b","c","d","eeeee","hahaha")
    println(str.filter { it.length == 5 }.sortedBy { it }.map { it.toUpperCase() })

    println(";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;")

    val its = arrayListOf(-1, 2, -3, 4, -5)
    var sum = 0
    its.filter { it > 0 }.forEach { sum += it }
    println(sum)

    println(";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;")

    val map2 = mapOf("key1" to 42,"haha" to 11,"hoho" to 33)
    val emptyMap = map2 - "key1"//-연산자로 제거
    println(emptyMap)
    println(map2)


}

