import java.util.Collections.sort

fun main(args: Array<String>) {
    val objHuman = object{
        val name = "einstein"
        val job ="scientist"
    }
    println("objHuman = ${objHuman}, objHuman.name = ${objHuman.name}, objHuman.job = ${objHuman.job}")

    val numbers = arrayListOf<Int>(4,1,3,2,8,5,7,6)
    numbers.sort()
    println("numbers.aort()= ${numbers}")
    numbers.sortDescending()
    println("numbers.sortDescending() = ${numbers}")
    println("numbers.sorted() = ${numbers.sorted()}")
    println("numbers.apply(ArrayList<Int>::sort) = ${numbers.apply(ArrayList<Int>::sort)}")
    println(".....................")

    sort(numbers, object : Comparator<Int>{
        override fun compare(o1: Int, o2: Int): Int {
            return o1 - o2
        }
    })

    sort(numbers, Comparator<Int>{o1,o2 -> o1 - o2})
    sort(numbers,{o1,o2 -> o1 - o2})
    sort(numbers){o1,o2 -> o1 - o2}

    val objComparable = object : Comparator<Int> {
        override fun compare(o1: Int, o2: Int): Int {
            return o1 - o2
        }
    }
    sort(numbers, objComparable)

    
}
