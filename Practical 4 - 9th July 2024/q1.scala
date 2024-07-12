object Inventory {

  def displayInventory(itemNames: Array[String], itemQuantities: Array[Int]): Unit = {
    println("\nCurrent Inventory: ")
    for (i <- itemNames.indices) {
      println(s"${itemNames(i)}: ${itemQuantities(i)}")
    }
  }

  def restockItem(itemName: String, quantityToAdd: Int, itemNames: Array[String], itemQuantities: Array[Int]): Unit = {
    var itemFound = false
    for (i <- itemNames.indices) {
      if (itemName == itemNames(i)) {
        itemQuantities(i) += quantityToAdd
        itemFound = true
        println(s"\nRestocked $quantityToAdd of $itemName. New quantity: ${itemQuantities(i)}\n")
      }
    }
    if (!itemFound) {
      println("\nNo such item in the inventory.\n")
    }
  }

  def sellItem(itemName: String, quantityToSell: Int, itemNames: Array[String], itemQuantities: Array[Int]): Unit = {
    var itemFound = false
    for (i <- itemNames.indices) {
      if (itemName == itemNames(i)) {
        itemFound = true
        if (itemQuantities(i) < quantityToSell) {
          println(s"\nNot enough quantity of $itemName in the stock.\n")
        } else {
          itemQuantities(i) -= quantityToSell
          println(s"Sold $quantityToSell of $itemName. Remaining quantity: ${itemQuantities(i)}")
        }
      }
    }
    if (!itemFound) {
      println("\nNo such item in the inventory.\n")
    }
  }

  def main(args: Array[String]): Unit = {
    val itemNames = Array("Item1", "Item2", "Item3", "Item4", "Item5")
    val itemQuantities = Array(4, 5, 2, 8, 3)

    displayInventory(itemNames, itemQuantities)
    restockItem("Item3", 4, itemNames, itemQuantities)
    sellItem("Item4", 3, itemNames, itemQuantities)
    displayInventory(itemNames, itemQuantities)
  }
}
