object EvenOdd{

  val isEven: Int=>String= number => s" $number is Even ";
  val isOdd: Int=>String= number => s" $number is Odd ";
  val isNegativeOrZero: Int=>String= number => s" $number is Zero or Negative";

  def matching(number:Int):Unit={
    number match
      case x if x<=0 => print(isNegativeOrZero(x));
      case x if x%2==0 => print(isEven(x));
      case _ => print(isOdd(number));
  }

  def main(args:Array[String]):Unit={
    print("enter a number : ");
    val input= scala.io.StdIn.readLine().toInt
    val result=matching(input);
  }

}