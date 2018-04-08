import com.fasterxml.jackson.module.kotlin.*
import java.net.URL

data class Personjackson(val name: String, val age: Int, val messages: List<String>) {
}

fun main(args: Array<String>) {

    val jsonjack = """{"name": "Kolineer", "age": "26", "messages" : ["message a","message b"]}"""
    val mapper = jacksonObjectMapper()

    println("=== JSON to Kotlin Object ===")
    println("1- read String")
    var person: Personjackson = mapper.readValue<Personjackson>(jsonjack)
    println(person)

    println("2- read URL")
    person = mapper.readValue<Personjackson>(URL("http://javasampleapproach.com/wp-content/uploads/2017/08/person.json"))
    println(person)

    println("///////////////////////////////////")
    var personMap: Map<String, Any> = mapper.readValue(jsonjack)
        personMap.forEach { println(it) }

    println("///////////////////////////////////")
    val jsonList = """[{"name": "Kolineer", "age": "26", "messages" : ["message a","message b"]},
                       {"name":"Kolineer Master","age":30,"messages":["I am Kotlin Master","still learning Kotlin"]}]"""

    var personList: List<Personjackson> = mapper.readValue(jsonList)
        personList.forEach { println(it) }
}