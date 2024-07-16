import scala.io.StdIn.readLine

object InventoryManagement{
    def getProductList(): List[String] = {
       var done = false
        var list = List[String]()

        while (!done){
            println("Enter the name of the product(done for terminate : )")
            val input = readLine()

            if(input == "done"){
                done = true
            }
            else{
                list = list :+ input
            }
        } 
        list
    }

    def printList(list : List[String]): Unit={
        println("The list of items : ")
        list.foreach(println)
    }

    def getTotalProducts(list : List[String]) : Unit = {
        println(s"Total number of products : ${list.length}")
        
    }

    def main(args : Array[String]): Unit = {
        val lst = getProductList()
        printList(lst)
        getTotalProducts(lst)
    }
}