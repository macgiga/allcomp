fun main(args: Array<String>) {
    println(alphabet())
    println(alphabet2())
    println(alphabet3())
}

fun alphabet(): String {
    val stringBuilder = StringBuilder()
    return with(stringBuilder) {
        for (letter in 'A'..'Z') {
            this.append(letter)
            append("!")    // this 생략 가능
        }
      //  this@OuterClass.somFunc()    // 바깥쪽 클래스 멤버 접근
        this.toString()    // return
    }
}

fun alphabet2() = with(StringBuilder()) {
    for (letter in 'A'..'Z') {
        append(letter)
    }
    toString()
}

fun alphabet3() = StringBuilder().apply {
    for (letter in 'A'..'Z') {
        append(letter)
    }
}.toString()

/*
fun createViewWithCustomAttributes(context: Context) = TextView(context).apply {
            text = "Sample"
            textSize = 20.0
            setPadding(10, 0, 0, 0)
        }

fun createViewWithCustomAttributes2(context: Context) {
    val t = TextView(context)
    t.text = "Sample"
    t.textSize = 20.0
    t.setPadding(10, 0, 0, 0)
    return t
}
*/

/*
for alphabet() = buildString {
    for (letter in 'A'..'Z') {
        append(letter)
    }
}*/
