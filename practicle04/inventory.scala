object inventory {

  val itemName: Array[String] =
    Array("E", "A", "B", "C", "D");
  val itemQuantity: Array[Int] = Array(3, 5, 6, 8, 9);

  def displayInventory(index: Int): Unit = {
    println(
      s"name : ${itemName(index - 1)} quantity : ${itemQuantity(index - 1)}"
    );

  }

  
  def main(args: Array[String]): Unit = {
    displayInventory(4);
    
  }
}
