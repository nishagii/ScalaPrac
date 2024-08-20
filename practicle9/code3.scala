object NameFormatter {

  //lambda functions
  val toUpper: String => String = str => str.toUpperCase
  val toLower: String => String = str => str.toLowerCase

  //  a string and a function to format it (higer order functions used)
  def formatNames(name: String)(format: String => String): String = format(name)

  def main(args: Array[String]): Unit = {

    val name1 = formatNames("Benny")(toUpper)
    val name2 = formatNames("Niroshan")(name => toUpper(name.substring(0, 2)) + toLower(name.substring(2)))
    val name3 = formatNames("Saman")(toLower)
    val name4 = formatNames("Kumara")(name => toUpper(name.substring(0, 1)) + toLower(name.substring(1, 5)) + toUpper(name.substring(5)))


    println(name1)  // Output: BENNY
    println(name2)  // Output: NIroshan
    println(name3)  // Output: saman
    println(name4)  // Output: KumarA
  }
}
