fun main(args: Array<String>) {
    var changable = "uno"
    val unchnagable = "no"
    var isNull = null
    var isString: String? = null

    var list = listOf(null) // it creates a list with a null element
    var list2: List<String?> = listOf(null) // it creates a list with a null element
    var list3: List<String?>? = null // it creates a list than can be null and storing null elemnts

    var nullTest: Int? = null
    println(nullTest?.plus(1) ?: 0) // if the nullTest variables is not null, it increases by 1 otherwise the result will be 0
    println(nullTest?.inc() ?: 0) // if the nullTest variables is not null, it increases by 1 otherwise the result will be 0
    println("hello world")

    var string1 = "one"
    var string2 = "two"
    var string3 = "three"
    println("I like to eat $string1 and $string2 but no $string3")

    val fishName = "Noname"
    when(fishName.length) {
        0 -> println("No name")
        in 3..12 -> println("Good fish name")
        else -> println("it is a good name")
    }

    import kotlin.math.pow
    val array = Array(7) { 1000.0.pow(it)}
    val sizes = arrayOf("byte", "kilobyte", "megabyte", "gigabyte",
            "terabyte", "petabyte", "exabyte")
    for ((i, value) in array.withIndex()) {
        println("1 ${sizes[i]} = ${value.toLong()} bytes")
    }

    val number = Array(5) { it + 11}
    val strings = mutableListOf<String>()
    for (elmnt in number) {
        println(elmnt)
        strings.add(elmnt.toString())
    }
    for (elmnt in strings) {
        println(elmnt)
    }
    val numbers = mutableListOf<Int>()
    for (i in 0..100) {
        if (i % 7 == 0) numbers.add(i)
    }
    // this loop does the same like the above
    for (i in 0..100 step 7) {
        numbers.add(i)
    }
    for (elmnt in numbers) {
        println(elmnt)
    }
}
