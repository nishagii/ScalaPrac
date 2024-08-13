object NumberCategorizer {
  def main(args: Array[String]): Unit = {

    println("Please enter an integer:")
    val input = scala.io.StdIn.readInt() 


    input match {
      case _ if input % 3 == 0 && input % 5 == 0  => println("Multiple of Both Three and Five")
      case _ if input % 3 == 0 => println("Multiple of Three")
      case _ if input % 5 == 0 => println("Multiple of Five")

      
      case _ => println("Not a Multiple of Three or Five")
    }
  }
}
