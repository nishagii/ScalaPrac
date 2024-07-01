object rounding {
  def mean(num1: Double, num2: Double): Double = {
    val mean = (num1 + num2) / 2
    round(mean)
  }
  def round(number: Double): Double = {
    val factor = 100.0
    val temp = (number * factor).toInt
    temp / factor
  }

  def main(args: Array[String]): Unit = {
    val num1 = 3.3443
    val num2 = 30.3543
    val mean = rounding.mean(num1, num2)
    println(f"The arithmetic mean of $num1 and $num2 is $mean")
  }
}
