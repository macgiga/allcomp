fun main(args: Array<String>) {
    val t = MyTest()
    with(t) {
        setup()
        test()
    }
}

class MyTest {
    lateinit var subject: TestSubject

    fun setup() {
        subject = TestSubject()
    }

    fun test() {
        subject.testMethod() // 직접 참조하는 객체에 접근
    }
}

class TestSubject {
    fun testMethod(){
        println("test")
    }
}
