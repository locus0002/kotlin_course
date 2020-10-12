/*
sequence: can be useful when we need to process step by step cause this makes a function to execute lazyly
*/
fun main(args: Array<String>) {
    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "red pepper")
    println(spices.filter{ it.contains("curry")}. sortedBy{it.length});
    println(spices.sortedBy{it.length});
    println(spices.filter {it[0] == 'c' && it[it.length - 1] == 'e'})
    println(spices.filter {it.startsWith('c') && it.endsWith('e')})
    //println(spices.filterIndexed {index, s -> index < 3}.filter { it.startsWith('c') })
    println(spices.filterIndexed {index, s -> index < 3 && s.startsWith('c')})
    // it is the same like above
    println(spices.take(3).filter {it.startsWith('c')})
}

