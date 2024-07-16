import scala.collection.mutable

case class Book(title: String, author: String, ISBN: String)

object LibraryManagement {
  var library: mutable.Set[Book] = mutable.Set(
    Book("ABCD", "Chandrapala", "123-456"),
    Book("EFGH", "soomapaala", "123-465"),
    Book("HIJK", "Amarapaala", "123-321")
  )

  def addBook(title: String, author: String, ISBN: String): Unit = {
    val newBook = Book(title, author, ISBN)
    library += newBook
    println(s"Book added : ${newBook.title}")
  }

  def removeBookByISBN(ISBN: String): Unit = {
    val removingBook = library.find(_.ISBN == ISBN)
    removingBook match {
      case Some(book) =>
        library -= book
        println(s"Book removed : ${book.title}")
      case None =>
        println("Book not found.")
    }
  }

  def isBookInLibrary(ISBN: String): Boolean = {
    library.exists(_.ISBN == ISBN)
  }

  def displayLibrary(): Unit = {
    println("Current library collection :")
    library.foreach(book => println(s"Title : ${book.title}, Author : ${book.author}, ISBN : ${book.ISBN}"))
  }

  def main(args: Array[String]): Unit = {
    var running = true

    addBook("asd", "isis", "12345")
    displayLibrary()
  }
}
