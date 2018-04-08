//Kotlin – Java Static Method equivalent in Kotlin

class Foo {

    companion object {

        fun exe(): String = "javasampleapproach.com"
        fun upperCase(s : String) : String = s.toUpperCase()
    }

    object Bar {

        fun bar(): String = "Bar"
    }

    object Num {

        fun doubleInt(i: Int): Int = i * 2
    }
}

fun main(args: Array<String>) {

    val static = Foo.exe()
    println(static)

    val upper = Foo.upperCase("javasampleapproach.com")
    println(upper)

    val bar = Foo.Bar.bar();
    println(bar)

    val num = Foo.Num.doubleInt(3);
    println(num)
}