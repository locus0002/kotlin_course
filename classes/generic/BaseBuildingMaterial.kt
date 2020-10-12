package Buildings

/*
open class BaseBuildingMaterial(val numberNeeded: Int = 1)
class Wood(numberNeeded: Int = 4) : BaseBuildingMaterial(numberNeeded)
class Brick(numberNeeded: Int = 8) : BaseBuildingMaterial(numberNeeded)
*/
//another way
open class BaseBuildingMaterial() {
    open val numberNeeded: Int = 1
}
class Wood() : BaseBuildingMaterial() {
    override val numberNeeded: Int = 4
}
class Brick() : BaseBuildingMaterial() {
    override val numberNeeded: Int = 8
}

class Building<T: BaseBuildingMaterial>(val material: T) {
    val baseMaterialsNeeded = 100
    val actualMaterialsNeeded = { baseMaterialsNeeded * material.numberNeeded }

    fun build() {
        println("Material needed: " + actualMaterialsNeeded() )
        println(material::class.simpleName)
    }
}