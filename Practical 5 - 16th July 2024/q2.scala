case class Book(title: String, author: String, isbn: String)

object LibraryManagement {

  var library: Set[Book] = Set(
    Book("Percy Jackson", "Rick Riordan", "0001"),
    Book("Harry Potter", "J. K. Rowling", "0002"),
    Book("The Vow", "Nicholas Sparks", "0003")
  )

  def addBook(book: Book): Unit = {
    library += book
    println(s"Book '${book.title}' added to the library.")
  }

  def removeBook(isbn: String): Unit = {
    var itemFound = false
  
    for (book <- library) {
      if (book.isbn == isbn) {
        library -= book  
        itemFound = true  
        println(s"Book '${book.title}' removed from the library.")
      }
    }

    if (!itemFound) {
      println(s"No book found with ISBN $isbn.")
    }
  }

  def checkBook(isbn: String): Boolean = {
    var found = false
    for (book <- library) {
      if (book.isbn == isbn) {
        found = true  // Book is found
      }
    }
    found 
  }

  def displayLibrary(): Unit = {
    if (library.isEmpty) {
      println("The library is empty.")
    } else {
      library.foreach { book =>
        println(s"Title: ${book.title}, Author: ${book.author}, ISBN: ${book.isbn}")
      }
    }
  }

  def searchBookByTitle(title: String): Boolean = {
    var found = false
    for (book <- library) {
      if (book.title == title) {
        found = true  // Book is found
      }
    }
    found
  }

  def displayBooksByAuthor(author: String): Unit = {
    var itemFound = false

    for (book <- library) {
      if (book.author == author) {
        itemFound = true
        println(s"Title: ${book.title}, Author: ${book.author}, ISBN: ${book.isbn}")
      }
    }

    if (!itemFound) {
      println(s"No books found by author $author.")
    }
  }

  def main(args: Array[String]): Unit = {
    println("Initial Library Collection:")
    displayLibrary()

    println("\nAdding a new book:")
    addBook(Book("The Hobbit", "J.R.R. Tolkien", "0004"))
    displayLibrary()

    println("\nRemoving a book by ISBN:")
    removeBook("0003")
    displayLibrary()

    println("\nChecking if a book is in the library by ISBN:")
    println(checkBook("0002"))

    println("\nSearching for a book by title:")
    val titleToSearch = "Percy Jackson"
    if (searchBookByTitle(titleToSearch)) {
      println(s"Book '$titleToSearch' found in the library.")
    } else {
      println(s"Book '$titleToSearch' not found in the library.")
    }

    println("\nDisplaying all books by a specific author:")
    displayBooksByAuthor("Rick Riordan")
  }
}
