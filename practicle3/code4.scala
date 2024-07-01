object SumOfEvens {
  def sumOfEvenNumbers(inputList: List[Int]): Int = {
    def sumEvens(list: List[Int], acc: Int): Int = {
      list match {
        case Nil => acc
        case head :: tail =>
          if (head % 2 == 0) sumEvens(tail, acc + head)
          else sumEvens(tail, acc)
      }
    }

    sumEvens(inputList, 0)
  }

  def main(args: Array[String]): Unit = {
    val numbers = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val sum = sumOfEvenNumbers(numbers)
    println(s"The sum of even numbers in the list is: $sum")
  }
}
