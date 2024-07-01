object StringFilterApp {
  def filterStringsGreaterThan5(strings: List[String]): List[String] = {
    def filterHelper(lst: List[String], acc: List[String]): List[String] = {
      lst match {
        case Nil => acc
        case head :: tail =>
          if (head.length > 5)
            filterHelper(tail, acc :+ head)
          else
            filterHelper(tail, acc)
      }
    }

    filterHelper(strings, List())
  }

  def main(args: Array[String]): Unit = {
    val inputStrings = List("hello", "world", "Scala", "programming", "fun", "amazing")
    val filteredStrings = filterStringsGreaterThan5(inputStrings)
    println("Filtered strings with length greater than 5: " + filteredStrings)
  }
}
