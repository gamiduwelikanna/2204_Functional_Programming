object Inventories extends App {

  val inventory1 = Map(
    1 -> ("Laptop", 10, 1500.0),
    2 -> ("Smartphone", 50, 800.0),
    3 -> ("Tablet", 20, 300.0)
  )

  val inventory2 = Map(
    2 -> ("Smartphone", 30, 750.0),
    4 -> ("Smartwatch", 15, 250.0)
  )


  val productNames = inventory1.values.map(_._1)
  println(s"Product Names: ${productNames.mkString(", ")}")


  val totalValue = inventory1.values.map { case (_, quantity, price) => quantity * price }.sum
  println(s"Total Value: $totalValue")


  val isEmpty = inventory1.isEmpty
  println(s"Is inventory1 empty? $isEmpty")


  val mergedInventory = (inventory1.toSeq ++ inventory2.toSeq)
    .groupBy(_._1)
    .map { case (id, products) =>
      val name = products.head._2._1
      val totalQuantity = products.map(_._2._2).sum
      val maxPrice = products.map(_._2._3).max
      id -> (name, totalQuantity, maxPrice)
    }

  println(s"Merged Inventory: $mergedInventory")


  def getProductDetails(inventory: Map[Int, (String, Int, Double)], productId: Int): String = {
    inventory.get(productId) match {
      case Some((name, quantity, price)) =>
        s"Product ID: $productId, Name: $name, Quantity: $quantity, Price: $price"
      case None =>
        s"Product with ID $productId does not exist in the inventory"
    }
  }

  
  val productIdToCheck = 8
  println(getProductDetails(inventory1, productIdToCheck))
}
