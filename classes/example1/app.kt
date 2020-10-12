import spices.*

fun main(args: Array<String>) {

    val myBook = Book("title", "author")
    val myeBook = Book("title", "author")

    val newSpice = SimpleSpice()
    println("Name: ${newSpice.name}")
    println("Level: ${newSpice.level}")
    println("Heat: ${newSpice.heat}")
    val spiceList = listOf(
        Spice("curry low", "low"),
        Spice("curry mild"),
        Spice("curry high", "high")
    )
    val spicyList = spiceList.filter { it.heat > 5 }
    println(spicyList)
}


fun makeSalt() = Spice("salt", "low")
