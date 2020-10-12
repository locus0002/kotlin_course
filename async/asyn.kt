import kotlinx.corutines.*

fun main(args: Array<String>) {
    GlobalScope.launch {
        delay(1000L)
        println("World async")
    }
    println("Hello! ")
    Thread.sleep(2000L)
}