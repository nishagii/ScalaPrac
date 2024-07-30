object InventorySystem {

  val inventory1: Map[Int, (String, Int, Double)] = Map(
    101 -> ("Product A", 10, 15.0),
    102 -> ("Product B", 5, 20.0),
    103 -> ("Product C", 8, 12.5)
  )

  val inventory2: Map[Int, (String, Int, Double)] = Map(
    102 -> ("Product B", 3, 25.0),
    104 -> ("Product D", 6, 18.0)
  )


  def getAllProductNames(inventory: Map[Int, (String, Int, Double)]): List[String] = {
    inventory.values.map(_._1).toList
  }


  def calculateTotalValue(inventory: Map[Int, (String, Int, Double)]): Double = {
    inventory.values.map { case (_, quantity, price) => quantity * price }.sum
  }


  def isInventoryEmpty(inventory: Map[Int, (String, Int, Double)]): Boolean = {
    inventory.isEmpty
  }


  def mergeInventories(inventory1: Map[Int, (String, Int, Double)], inventory2: Map[Int, (String, Int, Double)]): Map[Int, (String, Int, Double)] = {
    (inventory1.keySet ++ inventory2.keySet).map { id =>
      val (name1, quantity1, price1) = inventory1.getOrElse(id, ("", 0, 0.0))
      val (name2, quantity2, price2) = inventory2.getOrElse(id, ("", 0, 0.0))
      
      val totalQuantity = quantity1 + quantity2
      val highestPrice = math.max(price1, price2)

      id -> (if (name1.nonEmpty) name1 else name2, totalQuantity, highestPrice)
    }.toMap
  }

 
  def printProductDetails(inventory: Map[Int, (String, Int, Double)], productId: Int): Unit = {
    inventory.get(productId) match {
      case Some((name, quantity, price)) =>
        println(s"Product ID: $productId, Name: $name, Quantity: $quantity, Price: $price")
      case None =>
        println(s"Product ID: $productId does not exist.")
    }
  }

  def main(args: Array[String]): Unit = {

    println("Product Names in Inventory1: " + getAllProductNames(inventory1))

   
    println("Total Value of Inventory1: $" + calculateTotalValue(inventory1))


    println("Is Inventory1 empty? " + isInventoryEmpty(inventory1))

    val mergedInventory = mergeInventories(inventory1, inventory2)
    println("Merged Inventory: " + mergedInventory)


    printProductDetails(inventory1, 102)
  }
}
