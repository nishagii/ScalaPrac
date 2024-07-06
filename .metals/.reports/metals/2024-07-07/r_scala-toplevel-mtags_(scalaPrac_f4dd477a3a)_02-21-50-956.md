error id: file://<WORKSPACE>/practicle04/inventory.scala:[302..305) in Input.VirtualFile("file://<WORKSPACE>/practicle04/inventory.scala", "object inventory{
    def displayInventory(index:Int):Unit={
        val name: Array[String]=Array("value 1","value 2","value 3","value 4","value 5");
        val quantity:Array[Int]=Array(3,5,6,8,9);

        println(s"name : ${name(index-1)} quantity : ${quantity(index-1)}");


    }

    def 

    def main(args:Array[String]): Unit ={
        displayInventory(4);
    }
}")
file://<WORKSPACE>/practicle04/inventory.scala
file://<WORKSPACE>/practicle04/inventory.scala:13: error: expected identifier; obtained def
    def main(args:Array[String]): Unit ={
    ^
#### Short summary: 

expected identifier; obtained def