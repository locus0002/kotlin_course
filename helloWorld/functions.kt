import java.util.Calendar

fun main(args: Array<String>) {
    var fortuneCookie: String? = null
    /*var count = 0
    while (fortuneCookie != "Take it easy and enjoy life!" && count < 10) {
        fortuneCookie = getFortuneCookie()
        println("Your fortune is: ${fortuneCookie}")
        count++
    }*/
    /*for (i in 1..10) {
        fortuneCookie = getFortuneCookie(getBirthday())
        println("Your fortune is: ${fortuneCookie}")
        if (fortuneCookie.contains("Take it easy and enjoy life!")) break
    }*/
    repeat(10) {
        fortuneCookie = getFortuneCookie(getBirthday())
        println("Your fortune is: ${fortuneCookie}")
        if (fortuneCookie.contains("Take it easy and enjoy life!")) break
    }
}

fun getBirthday(): Int {
    print("Enter your birthday: ")
    return readLine()?.toIntOrNull() ?: 0;
}

fun getFortuneCookie(birthday: Int): String {
    val messages = listOf(
        "You will have a great day!",
        "Things will go well for you today",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune."
    )
    //val index = birthday % messages.size
    return when (birthday) {
        in 1..5 -> messages.get(0)
        in 6..10 -> messages.get(1)
        in 11..15 -> messages.get(2)
        in 16..20 -> messages.get(3)
        in 21..25 -> messages.get(4)
        in 26..30 -> messages.get(5)
        31 -> messages.get(6)
        else -> messages.get(0)
    }
}

fun dayOfWeek() {
    println("What is day is today?")
    when(Calendar.getInstance().get(Calendar.DAY_OF_WEEK)) {
        1 -> println("Sunday")
        2 -> println("Monday")
        3 -> println("Tuesday")
        4 -> println("Wendesday")
        5 -> println("Thursday")
        6 -> println("Friday")
        7 -> println("Saturday")
        else -> println("I do not know")
    }
}

fun stringTemplate() {
    val hour = "24"
    val greeting = if (hour.toInt() > 12) "Good night, kotlin" else "Good morning, kotlin"
    val greeting2 = "Good ${if (hour.toInt() > 12) "night" else "morning"}, kotlin"
}