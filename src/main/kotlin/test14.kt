fun main(args: Array<String>) {
    println(findFixPoint())
    println(Math.cos(1.0))
    gugudan()
}

tailrec fun findFixPoint(x: Double = 1.0): Double = if (x == Math.cos(x)) x else findFixPoint(Math.cos(x))
tailrec fun gugudan(dan: Int = 2): Unit = if (dan == 9) for (i in 1..9) println("$dan * $i  = ${dan * i}") else gugudan(dan + 1)