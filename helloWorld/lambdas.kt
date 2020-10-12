import kotlin.random.Random

fun main(args: Array<String>) {
    println(rollDice1())
    println(rollDice2(12))
    println(rollDice3(12))
    println(rollDice4(12))
    gamePlay(5, rollDice4)
}

//this is a lambda
val rollDice1 = { Random.nextInt(1,12) }

//this is a lambda
val rollDice2 = { sides:Int -> Random.nextInt(1,sides) }

//this is a lambda
val rollDice3 = { sides:Int -> if (sides == 0) 0 else Random.nextInt(1,sides) }

//this is a function type notation
val rollDice4: (sides: Int) -> Int = { sides -> if (sides == 0) 0 else Random.nextInt(1,sides) }

fun gamePlay(roll: Int, operation: (Int) -> Int ) {
    println("Roll ${roll}")
    println(operation(roll))
}