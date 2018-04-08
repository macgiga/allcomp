fun main(args: Array<String>) {
    //확장
    val test: (HTML.() -> Unit) = {
        println("test")
    }
    html(test)
}

class HTML {
    fun body() {
        println("HTML")
    }
}

fun html(aaa: HTML.() -> Unit): HTML {
    val html = HTML()  // receiver 객체 생성
    html.aaa()        // receiver 객체를 람다로 전달
    return html
}
//html {       // receiver가 있는 람다의 시작점
//    body()   // receiver 객체의 메소드를 호출
//}