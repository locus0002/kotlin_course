fun main(args: Array<String>) {
    println("Can you add another fish: " + fitMoreFish(10.0, listOf(3,3,3)))
    println("Can you add another fish: " + fitMoreFish(8.0, listOf(2,2,2), hasDecorations = false))
    println("Can you add another fish: " + fitMoreFish(9.0, listOf(1,1,3), 3))
    println("Can you add another fish: " + fitMoreFish(10.0, listOf(), 7, true))
}

fun fitMoreFish(tankSize: Double, currentFish: List<Int>, fishSize: Int = 2, hasDecorations: Boolean = true): Boolean {
    val realTankSize = if (hasDecorations) { tankSize * 0.8 } else { tankSize }
    val totalSize = (if (currentFish.size > 0) {currentFish.reduce { acc, next -> acc + next }} else 0) + fishSize
    // in a list kotlin can sum all elements
    // currentFish.sum()
    return totalSize <= realTankSize
}