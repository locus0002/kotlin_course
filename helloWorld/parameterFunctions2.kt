
fun main(args: Array<String>) {
    val mood = getMood()
    println(whatShouldIDoToday(mood))
    println(whatShouldIDoToday(mood, "rainy"))
    println(whatShouldIDoToday(mood, "cloudy"))
    // also
    println(whatShouldIDoToday(readLine()!!, "cloudy"))
}

fun whatShouldIDoToday(mood: String, weather: String = "sunny", temperature: Int = 24): String {
    return when {
        happyMood(mood, weather) -> "go for a walk"
        sadMood(mood, weather) -> "go for a coffe"
        weatherMood(mood, weather) -> "gor for a run"
        else -> "stay at home and read"
    }
}

fun happyMood(mood: String, weather: String) = mood == "happy" && weather == "sunny"
fun sadMood(mood: String, weather: String) = mood == "sad" && weather == "rainy"
fun weatherMood(mood: String, weather: String) = mood == "angry" && weather == "cloudy"
fun getMood(): String {
    print("How do you felel today? ")
    return readLine()?.toString() ?: "happy";
}