import scala.io.StdIn
object integer {
  def matching(input: Int): Unit = input match
    case x if (x < 0)      => println("Negative");
    case x if (x == 0)     => println("zero");
    case x if (x % 2 == 0) => println("Even");
    case x if (x % 2 != 0) => println("Odd");

  def main(args: Array[String]): Unit = {
    println("Enter a number : ");
    val input = StdIn.readInt();
    matching(input);
  }
}
