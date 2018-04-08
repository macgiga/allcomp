import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.google.gson.reflect.TypeToken

data class Personone(val name: String, val age: Int, val messages: List<String>) {
}

fun main(args: Array<String>) {

    val json = """{"name": "Kolineer", "age": "26", "messages" : ["Master Kotlin","At JavaSampleApproach"]}"""
    val gson = Gson()

    val person1: Personone = gson.fromJson(json, Personone::class.java)
    println(person1)

    val gson2 = GsonBuilder().setPrettyPrinting().create()

    val person2 = Personone("Kolineer", 27, listOf("I am Kotlin Learner", "At JavaSampleAproach"))
    val jsonPerson: String = gson2.toJson(person2)
    println(jsonPerson)
////////////////////////////////////////////////////////////////////////
    val jsonList = """[{"name": "Kolineer", "age": "26", "messages" : ["Master Kotlin","At JavaSampleApproach"]},
                       {"name": "Kolineer Master","age":"30","messages":["I am Kotlin Master","still learning Kotlin at JavaSampleAproach"]}]"""

    val gson3 = GsonBuilder().setPrettyPrinting().create()

    println("=== List from JSON ===")
    var personList: List<Personone> = gson3.fromJson(jsonList, object : TypeToken<List<Personone>>() {}.type)
        personList.forEach { println(it) }

    println("=== List to JSON ===")
    val jsonPersonList: String = gson3.toJson(personList)
    println(jsonPersonList)
///////////////////////////////////////////////////////////////////////////////
    val jsonmap = """{"name": "Kolineer", "age": "26", "messages" : ["Master Kotlin","At JavaSampleApproach"]}"""
    val gson4 = GsonBuilder().setPrettyPrinting().create()

    println("=== Map from JSON ===")
    var personMap: Map<String, Any> = gson4.fromJson(jsonmap, object : TypeToken<Map<String, Any>>() {}.type)
    personMap.forEach { println(it) }

    println("=== Map to JSON ===")
    val jsonPersonMap: String = gson4.toJson(personMap)
    println(jsonPersonMap)
}