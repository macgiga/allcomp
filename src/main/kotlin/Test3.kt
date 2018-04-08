fun main(args: Array<String>) {
    val a =1
    val b =2
    val max = if (a > b) a else b
    foo()
}
//람다 식 대신 익명 함수 를 사용해도 된다. 익명 함수에서 return 문장은 익명 함수 자체에서 리턴한다
fun foo() {
    val ints = listOf(1,2,3,4)
    ints.forEach( fun(value: Int) {
        if (value == 0) return // 익명 함수 호출에 대한 로컬 리턴. 예, forEach 루프로 리턴
        print(value)
    })
}
//사실 코틀린은 주요 생성자에서 프로퍼티를 선언하고 초기화할 수 있는 간결한 구문을 제공한다:
class Personformat(val firstName: String, val lastName: String, var age: Int)

/*
클래스는 다음을 가질 수 있다:
생성자와 초기화 블록
함수
프로퍼티
중첩 클래스와 내부 클래스
오브젝트 선언
*/

//클래스에 주요 생성자가 없으면, 각 보조 생성자에서 super 키워드로 기반 타입을 초기화하거나 그걸 하는 다른 생성자를 호출해야 한다
/*class MyView : View {
    constructor(ctx: Context) : super(ctx)
    constructor(ctx: Context, attrs: AttributeSet) : super(ctx, attrs)
}*/
