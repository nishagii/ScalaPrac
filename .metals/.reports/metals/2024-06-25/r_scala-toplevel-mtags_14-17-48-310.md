error id: file://<WORKSPACE>/lecturesCode/blast.scala:[527..528) in Input.VirtualFile("file://<WORKSPACE>/lecturesCode/blast.scala", "// object blast extends App{
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

    def prime(p:Int,n:Int=2):Boolean= n match
        case x if(x==p) => true
        case x if gcd(p,x)=>true
        case x => prime(p,x+1)
    
    def 
}



")
file://<WORKSPACE>/lecturesCode/blast.scala
file://<WORKSPACE>/lecturesCode/blast.scala:24: error: expected identifier; obtained rbrace
}
^
#### Short summary: 

expected identifier; obtained rbrace