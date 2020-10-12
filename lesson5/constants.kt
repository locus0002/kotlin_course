import kotlin.random.Random

fun main(args: Array<String>) {
    if (Book.canBorrow()) {
        val newBook = Book("El psicoanalist", "Jhon K.")
        val cat = Puppy()
        newBook.printURL()
        newBook.tornPages(123)
        println("The book has ${newBook.pages} pages")
        while (newBook.pages > 0) {
            cat.playWithBook(newBook)
            println("The book has ${newBook.pages} pages")
        }
        println("The current page is ${newBook.countPage}")
        println("The book ${newBook.title} was borrowed")
        println("Book weight: ${newBook.getWeight()}")
    }
    if (Book.canBorrow()) {
        val newBook = Book("La historia", "Jhon K.")
        newBook.printURL()
        println("The book ${newBook.title} was borrowed")
    }
    if (Book.canBorrow()) {
        val newBook = Book("Mercedez", "Jhon K.")
        newBook.printURL()
        println("The book ${newBook.title} was borrowed")
    }
    if (Book.canBorrow()) {
        val newBook = Book("El profesor", "Jhon K.")
        newBook.printURL()
        println("The book ${newBook.title} was borrowed")
    }
}

const val MAX_BOOKS = 3

object Constants {
    const val BASE_URL = "234";
}

//fun Book.getWeight(): Double = this.pages * 1.5
fun Book.getWeight(): Double { return pages * 1.5 }

fun Book.tornPages(currentPage: Int) { this.countPage = currentPage }

class Puppy {
    fun playWithBook(book: Book) {
        book.pages = Random.nextInt(0, book.pages)
    }
}

class Book(val title: String, val author: String, val year: Int = 2010) {
    var pages = 100
    var countPage = 0
    companion object {
        var sumBorrowedBooks = 0
        val BASE_URL = "https://catalog.vlac/"
        fun canBorrow(): Boolean {
            if (Book.sumBorrowedBooks < MAX_BOOKS) {
                return true
            }
            return false
        }
    }
    init {
        Book.sumBorrowedBooks++
    }
    
    fun getData(): Pair<String, String> {
        return Pair(title, author)
    }

    fun getAllData(): Triple<String, String, Int> {
        return Triple(title, author, year)
    }

    fun printURL() {
        println(Book.BASE_URL + title + Constants.BASE_URL + ".html")
    }
}