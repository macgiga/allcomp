
fun getNumberInt(max:Int) = (Math.random()  * max).toInt() + 1

enum class Hedrom(val faces: Int){
    Tetrahedron(4),Cube(6),Octahedron(8),Dodecahedron(12)
}

class Dice(val sides: Hedrom){
    fun cast(ranFun:(Int) -> Int) = ranFun(sides.faces)
    override fun toString(): String {
        //return "Dice(${sides.name}) casts '${cast(fun(n:Int)=(Math.random()  * n).toInt() + 1)}'"
        return "Dice(${this.sides.name}) casts '${cast({n -> (Math.random()  * n).toInt() + 1})}'"
        //return "Dice(${this.sides.name}) casts '${cast{ n -> (Math.random()  * n).toInt() + 1}}'"
        //return "Dice(${sides.name}) casts '${cast(::getNumberInt)}'"//함수 레퍼런스
    }
}
fun main(args: Array<String>) {
    val dices:List<Dice> = listOf(Dice(Hedrom.Cube),Dice(Hedrom.Dodecahedron),Dice(Hedrom.Octahedron),Dice(Hedrom.Tetrahedron))
    for (dice in dices) println(dice.toString())
}