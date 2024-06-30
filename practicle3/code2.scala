object StringFilter{
    def filter(inputList: List[String]):List[String]={
        inputList.filter(_.length>5)
    }

    def main(args:Array[String]): Unit={
        val stringList=List("hello", "world", "Scala", "programming", "is", "awesome")
        val filteredList=filter(stringList)
        println(s"Original list: $stringList")
        println(s"Filtered List: $filteredList")
    }
}