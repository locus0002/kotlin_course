package spices

class SimpleSpice {
    val name: String = "curry"
    val level: String = "mild"
    val heat: Int
        get() {
            return when(level) {
                "mild" -> 5
                else -> 1
            }
        }
}