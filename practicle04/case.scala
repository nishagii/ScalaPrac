object StringFormatter {
    def toUpper(input: String): String = {
        input.toUpperCase
    }

    def toLower(input: String): String = {
        input.toLowerCase
    }

    def formatNames(name: String, formatFunc: String => String): String = {
        formatFunc(name)
    }

    def main(args: Array[String]): Unit = {
        val names = List("Benny", "Niroshan", "Saman", "Kumara")

        // Apply specific formatting to each name
        names.foreach { name =>
            val formattedName = name match {
                case "Benny" => formatNames(name, toUpper)
                case "Niroshan" => 
                    val part1 = formatNames(name.substring(0, 2), toUpper)
                    val part2 = formatNames(name.substring(2), toLower)
                    part1 + part2
                case "Saman" => formatNames(name, toLower)
                case "Kumara" =>
                    val part1 = formatNames(name.substring(0, 1), toUpper)
                    val part2 = formatNames(name.substring(1, 5), toLower)
                    val part3 = formatNames(name.substring(5), toUpper)
                    part1 + part2 + part3
                case _ => name
            }
            println(formattedName)
        }
    }
}
