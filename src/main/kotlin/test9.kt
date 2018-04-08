fun main(args: Array<String>) {
    getName({ name -> setCommon() + "$name" })
    getName3({ lastName, firstName -> setCommon3() + "$firstName" + " $lastName" })
    getName4("yeol", "Park", { a, b -> setCommon4(a, b) })
}

fun getName(body: (String) -> String) {
    println(body("Park"))
}

fun getName3(body: (String, String) -> String) {
    println(body("Park", "yeol"))
}

fun getName4(firstName: String, lastName: String, body: (String, String) -> String) {
    println(body(firstName, lastName))
}

fun setCommon(): String {
    return "My name is "
}

fun setCommon3(): String {
    return "My name is "
}

fun setCommon4(firstName: String, lastName: String): String {
    return "My name is $firstName $lastName"
}

/*
- 람다식은 중괄호 { }로 묶임
- 파라미터(타입 생략 가능)가 있는 경우 -> 전에 선언
- body는 -> 후에 선언
*/
