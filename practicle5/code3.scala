import scala.io.StdIn.readLine

object FibonacciSequence {
  def main(args: Array[String]): Unit = {
    print("Enter the number of Fibonacci numbers to print: ")
    val choice = readLine().toInt

    if(choice>50)    println("please enter a number less than 50")
    
    else printFibonacci(choice)
  }

  def printFibonacci(n: Int): Unit = {
    for (i <- 0 until n) {
      print(s"${fibonacci(i)} ")
    }
    println()
  }

  
  def fibonacci(n: Int): Int = {
    if (n <= 0) 0
    else if (n == 1) 1
    else fibonacci(n - 1) + fibonacci(n - 2)
  }
}
