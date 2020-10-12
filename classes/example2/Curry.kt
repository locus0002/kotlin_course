package spices

class Curry(name: String, spiciness: String,
            color: SpiceColor = YellowSpiceColor) : 
    Spice(name, spiciness, color), Grinder {

    override var heat: Int = 0
        get() {
            return when (spiciness) {
                "low" -> 2
                "mild" -> 5
                "high" -> 7
                else -> 1
            }
        }

    override fun grind() {
        println("Powder ingredients")
    }

    override fun prepareSpice() {
        grind()
        println("The curry is been prepared")
    }
}