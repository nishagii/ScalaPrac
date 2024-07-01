object StringReversal{
    def reverse(input:String): String={
        if (input.isEmpty()){
            ""
        }else{
            reverse(input.tail) + input.head
        }
    }

    def main(args: Array[String]): Unit={
        println("")
        val originalString= scala.io.StdIn.readLine()
        val reversedString=reverse(originalString)
        println(s"Original String: $originalString")
        println(s"Reversed String: $reversedString")
    }
}