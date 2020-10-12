package spices

abstract class Spice(val name: String, var spiciness: String = "mild", color: SpiceColor) :
SpiceColor by color {
    abstract val heat: Int
    abstract fun prepareSpice()
}