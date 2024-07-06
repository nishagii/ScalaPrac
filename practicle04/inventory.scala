object inventory {

  val itemName: Array[String] =
    Array("E", "A", "B", "C", "D");
  val itemQuantity: Array[Int] = Array(3, 5, 6, 8, 9);

  def displayInventory(index: Int): Unit = {
    println(
      s"name : ${itemName(index - 1)} quantity : ${itemQuantity(index - 1)}"
    );

  }

  def reStockItems(item: String, quantity: Int): Unit = {
    val index = itemName.indexOf(item);
    if (index >= 0) {
      itemQuantity(index) += quantity;
      println(s"Restocked ${item}. new quantity is ${itemQuantity(index)}");

    } else {
      println(s"item ${item} not found in the inventory")
    }
  }

  def sellItem(name: String, quantity: Int): Unit = {
    val index = itemName.indexOf(name)

    if (index >= 0) {
      if (itemQuantity(index) >= quantity) {
        itemQuantity(index) -= quantity;
        println(
          s"Sold $quantity of $name. Remaining quantity: ${itemQuantity(index)}"
        )
      } else {
        println(
          s"Not enough quantity of $name to sell. Current quantity: ${itemQuantity(index)}"
        )
      }

    }else{
        println(s"item $name not found in the inventory")
    }
  }

  
  def main(args: Array[String]): Unit = {
    displayInventory(4);
    reStockItems("A", 5);
    sellItem("c",2);
  }
}
