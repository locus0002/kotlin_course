package spices

class Spice(val name: String, var spiciness: String = "mild") {
    //private val heat: Int
    val heat: Int
        get() {
            return when (spiciness) {
                "low" -> 2
                "mild" -> 5
                "high" -> 7
                else -> 1
            }
        }
    init {
        println("Name: ${name}")
        println("Spiciness: ${spiciness}")
        println("Heat: ${heat}")
    }
}