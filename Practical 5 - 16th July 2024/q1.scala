import scala.io.StdIn.readLine

object InventoryManagement {
  def getProducts(): List[String] = {
    var products: List[String] = List()
    var input: String = ""

    while (input != "done") {
      input = readLine("Enter a product (Enter done to terminate): ")
      if (input != "done") {
        products = products :+ input
      }
    }
    products
  }

  def printProducts(products: List[String]): Unit = {
    for (i <- products.indices) {
      println(s"${i + 1}. ${products(i)}")
    }
  }

  def count(products: List[String]): Int = {
    products.length
  }

  def main(args: Array[String]): Unit = {
    val products = getProducts()
    println("\nList of products")
    printProducts(products)
    println(s"Count of products is ${count(products)}")
  }
}

