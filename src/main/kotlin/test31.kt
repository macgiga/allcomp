fun myFun(p:()->Unit) =p()

fun takePrintNameFunction(name:String,pnFun:(String)->Unit){
    val local = pnFun
    local(name)//인자로 넘어온 함수 실행
}

fun supplyPrintNameFunction():(String) -> Unit{
    return {name:String -> println(name)}//람다
}

fun main(args: Array<String>) {

    myFun{
        println("hey")
    }

    //변수에 함수담기
    val printName = fun(name:String){//익명함수
        println(name)
    }

    printName("hong")
   // println(printName.javaClass)

    val pName2 = printName //변수에 함수담기
    pName2("gil")

    val pName3 = {name:String -> println(name)}//람다
    pName3("dong")

    //인자로 전달할수 있음
    takePrintNameFunction("win",pName2)//pName2 실행 local("win")
    takePrintNameFunction("win2",fun(n:String){println(n)})
    takePrintNameFunction("win3",{x -> println(x)})//람다
    takePrintNameFunction("win4"){x -> println(x)} //밖으로 뺄수 있음

    //리턴값으로 함수를 전달할수 있다
    takePrintNameFunction("hong",supplyPrintNameFunction())
    supplyPrintNameFunction()("gill")
    val pName4 = supplyPrintNameFunction()
    pName4("dong")

    listOf<Int>(1,2,3,4,5,6,7,8).showNumbersToString({n -> n % 2 == 1}, concats)
    (1..9).toList().showNumbersToString(fun(n:Int)=n % 2 == 0,concats)
}

fun List<Int>.showNumbersToString(pre:(Int) -> Boolean ,con:(List<Int>,String) -> String){
    val list = arrayListOf<Int>()
    for(n in this){
        if(pre(n))list.add(n)
    }
    println(con(this,"-"))
}

val concats = fun(ints:List<Int>,sep:String):String{
    var s = ""
    for((i,n) in ints.withIndex()){
        if(i < ints.lastIndex) s += "$n$sep"
        else s+= n
    }
    return s
}