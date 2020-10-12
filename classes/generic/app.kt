import Buildings.*

fun main(args: Array<String>) {
    val newBulding = Building(Wood())
    val newBrickBulding = Building(Brick())
    newBulding.build()
    newBrickBulding.build()
    isSmallBuilding(newBulding)
    isSmallBuilding(newBrickBulding)
}

fun <T:BaseBuildingMaterial> isSmallBuilding( materials: Building<T> ) {
    if (materials.actualMaterialsNeeded() <= 400) println("It is small")
    else println("It is huge")
}