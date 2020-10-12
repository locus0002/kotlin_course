package spices

enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF),
    YELLOW(0xFFFF00)
}

interface SpiceColor {
    val color: Color
}

// this is a singleton class that does mean that is going to be instanced once
object YellowSpiceColor : SpiceColor {
    override val color = Color.YELLOW
}