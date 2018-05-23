import Hohahoha.name

fun main(args: Array<String>) {
    listOf(1,2,3,4,5).filter { it > 2 }.map { it * 2 }.forEach { println(it) }
    //4
    //5
    //6
    //7
    //8
    //9
    Hohahoha.heyname().forEach { print(it) }
    HoClass.heyname().forEach { print(it) }
}

object Hohahoha{
    val name:String = "hey"
    fun heyname(): String {
        return name + "haha"
    }
}

class HoClass{
    val name1:String = "ha"
    companion object Cobject{

        fun heyname():String{
            return  "hey"
        }

    }
}