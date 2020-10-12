
fun main(args: Array<String>) {
    val myGame = Game()
    while(true) {
        print("Enter a direction: n/s/e/w:")
        myGame.makeMove(readLine()?.toString() ?: null)
    }
    
    /*
    println(myGame.path)
    myGame.north()
    myGame.south()
    myGame.east()
    myGame.west()
    myGame.end()
    println(myGame.path)
    */
}

fun testHigOrder() {
    val numbers = listOf<Int>(1,2,3,4,5,6,7,8,9,0)
    custom(numbers) {
        this.forEach{
            if (it % 3 == 0) print("${it} ")
        }
    }
    println ("\n" + numbers.custom2(3, divBy))
}

enum class Directions {
    NORTH,
    SOUTH,
    EAST,
    WEST,
    START,
    END
}

class Game(var path: MutableList<Directions> = mutableListOf(Directions.START)) {
    val north = { path.add(Directions.NORTH) }
    val south = { path.add(Directions.SOUTH) }
    val east = { path.add(Directions.EAST) }
    val west = { path.add(Directions.WEST) }
    val end = {
        path.add(Directions.END)
        println("GAME OVER")
        //path.forEach { println(it) }
        println("${path}")
        //path = mutableListOf()
        path.clear()
        false
    }

    fun move(where: () -> Boolean) {
        where()
    }

    fun makeMove(_to: String?) {
        when(_to) {
            "n" -> move(north)
            "s" -> move(south)
            "w" -> move(west)
            "e" -> move(east)
            else -> move(end)
        }
    }
}

fun custom(currentList: List<Int>, block: List<Int>.() -> Unit) {
    currentList.block()
}

 
val divBy: (factor: Int, elmnt: Int) -> Boolean = { factor, elmnt -> elmnt % factor == 0 }

fun List<Int>.custom2(factor: Int, operation: (Int, Int) -> Boolean): List<Int> {
    val newList = mutableListOf<Int>()
    this.forEach {
        if (operation(factor, it) ) {
            newList.add(it)
        }
    }

    return newList
}
