
fun main(args: Array<String>) {
    val newBook = Book("Mr Mercedez", "Jhon Knazebak")
    val newBookN = BookNormal("Mr Mercedez", "Jhon Knazebak")
    val _title = newBookN.title
    val _author = newBookN.author
    val _year = newBookN.year
    println(_title)
    println(_author)
    println(_year)

    var (_ptitle, _pauthor) = newBookN.getData()
    var bookData = newBookN.getData()
    println ("Title ${_ptitle} Author: ${_pauthor}")
    println ("Title ${bookData.first} Author: ${bookData.second}")

    var (_ttitle, _tauthor, _tyear) = newBookN.getAllData()
    var bookAllData = newBookN.getAllData()

    println ("Title ${_ttitle} Author: ${_tauthor} Year: ${_tyear}")
    println ("Title ${bookAllData.first} Author: ${bookAllData.second} Year: ${bookAllData.third}")


    val (title, author, year) = newBook // with a normal class this line is not going to work
    println(title)
    println(author)
    println(year)

    val allBooks = setOf(
        BookNormal("El psicoanalist", "Jhon K."),
        BookNormal("La historia", "Jhon K."),
        BookNormal("Mercedez", "Jhon K."))
    val library = mapOf("Jhon K." to allBooks)
    library.values.forEach{ if (it.any { it.title.contains("Mercedez") }) println("There is a book") }
    val moreBooks = mutableMapOf<String, String>()
    moreBooks["Misery"] = "Stephen K."
    val foundBook = moreBooks.getOrPut("Sunshine") {"Stephen K."}
    println(foundBook)
}

class BookNormal(val title: String, val author: String, val year: Int = 2010) {
    fun getData(): Pair<String, String> {
        return Pair(title, author)
    }

    fun getAllData(): Triple<String, String, Int> {
        return Triple(title, author, year)
    }
}

data class Book(val title: String, val author: String, val year: Int = 2010)