
open class Book (val title: String, val author: String) {
    private var currentPage = 0
    open fun readPage(){
        currentPage++
    }
}

class eBook(title: String, author: String, var format: String = "text"): Book (title, author) {
    private var words = 0
    override fun readPage() {
        words = words.plus(250)
    }
}