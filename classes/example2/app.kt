import spices.*

fun main(args: Array<String>) {
    val newCurry = Curry("green", "high")
    val pink = SpiceContainer(Curry("pink", "low"))
    val black = SpiceContainer(Curry("black", "high"))
    val (spice) = black // it is allowed to assign all properties follow by a comma
    newCurry.prepareSpice()
    println("Curry color: ${newCurry.color}")
    println("Curry name: ${newCurry.name}")
    println("Curry name: ${newCurry.spiciness}")
    println("Curry heat: ${newCurry.heat}")
    println("Label: ${pink.label}")
    println("Label: ${black.label}")
}