error id: file://<WORKSPACE>/lecturesCode/blast.scala:[380..381) in Input.VirtualFile("file://<WORKSPACE>/lecturesCode/blast.scala", "// object blast extends App{
//     def blast(n:Int):Unit={
//         if(n>1) blast(n-1)
//         else println("Blastoff!!")
//         println(n)
//     }
//     blast(3)
// }

object gcd extends App{
    def gcd(a: Int, b: Int): Int = b match {
        case 0 => a
        case x if x > a => gcd(x, a)
        case _ => gcd(b, a % b)
    }
    println(gcd(15, 35))

    def 
}



")
file://<WORKSPACE>/lecturesCode/blast.scala
file://<WORKSPACE>/lecturesCode/blast.scala:19: error: expected identifier; obtained rbrace
}
^
#### Short summary: 

expected identifier; obtained rbrace