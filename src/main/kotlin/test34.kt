class StandardFunctions{
    init {
        letFunc()
        mapFunc()
        withFunc()
        applyFunc()
        runFunc()
        alsoFunc()
    }
    fun letFunc():Unit{
        val obj="ABCDE"
        var count =0
        val result :Char = obj.let {
            println("$count in the let() function:")
            count++    //closure
            println("this =${this}")
            println("this@StandardFunctions = ${this@StandardFunctions}")
            println("it = $it")
//            return@let 'B'
            'A'
        }
        println("result =>  ${result} and count => $count  \n\n")
    }

    fun mapFunc():Unit{
        val obj="ABCDE".toList()
        var count =0
        val result  = obj.map {
            println("$count in the map() function:")
            count++    //closure
            println("this =${this}")
            println("this@StandardFunctions = ${this@StandardFunctions}")
            println("it = $it")
//            return@let 'B'
//            'A'
            it.toLowerCase()
        }
        println("result =>  ${result} and count => $count  \n\n")
    }
    fun withFunc():Unit{
        val obj=Toy("Gundam",100,ToyType.DOLL)
        var count =0
        val result  = with(obj){
            println("$count in the with() function:")
            count++    //closure
            println("this =${this}")
            println("this@StandardFunctions = ${this@StandardFunctions}")
//            println("it = $it")
            name +="mk-2"
            price =1000
            category = ToyType.ROBOT
            'A'
        }
        println("result =>  ${result} and count => $count  ")
        println(obj)
        println()
    }
    fun applyFunc():Unit{
        val obj=Toy("Princess")
        var count =0
        val result  = obj.apply{
            println("$count in the apply() function:")
            count++    //closure
            println("this =${this}")
            println("this@StandardFunctions = ${this@StandardFunctions}")
//            println("it = $it")
            name +=" elsa"
            price =2000
            category = ToyType.DOLL
            'A'
        }
        println("result =>  ${result} and count => $count  ")
        println(obj)
        println()
    }
    fun runFunc():Unit{
        val obj=Toy("tesla",100,ToyType.SPACHSHIP)
        var count =0
        val result  = obj.run{
            println("$count in the run() function:")
            count++    //closure
            println("this =${this}")
            println("this@StandardFunctions = ${this@StandardFunctions}")
//            println("it = $it")
            name +=" model s"
            price =10000
            category = ToyType.CAR
            'A'
        }
        println("result =>  ${result} and count => $count  ")
        println(obj)
        println()
    }
    fun alsoFunc():Unit{
        val obj=Toy("apolo",100,ToyType.BRICK)
        var count =0
        val result  = obj.also{
            println("$count in the also() function:")
            count++    //closure
            println("this =${this}")
            println("this@StandardFunctions = ${this@StandardFunctions}")
            println("it = $it")
            it.name +=" xii"
            it.price =999999
            it.category = ToyType.SPACHSHIP
            'A'
        }
        println("result =>  ${result} and count => $count  ")
        println(obj)
        println()
    }
}
enum class ToyType{NONE,ROBOT,DOLL,CAR,BRICK,SPACHSHIP}
data class Toy(var name:String,var price:Int=0,var category:ToyType=ToyType.NONE)
fun main(args: Array<String>) {
    StandardFunctions()
}