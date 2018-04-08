//Kotlin Lazy Initialization Example

class BookManager {

    companion object {

        fun loadBooks(person: Person): List<String> {

            println("Load books for ${person.name}")
            return listOf("Master Kotlin at JavaSampleApproach", "Be Happy to become Kotlineer")
        }

    }
}

data class Person(val name: String) {

    val books by lazy { BookManager.loadBooks(this) }
}

fun main(args: Array<String>) {

    val person = Person("Andrien")

    println(person.books)

    println("--- call again ---")
    println(person.books)
}

