error id: file://<WORKSPACE>/lecturesCode/blast.scala:[640..640) in Input.VirtualFile("file://<WORKSPACE>/lecturesCode/blast.scala", "// object blast extends App{
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

    def prime(p:Int,n:Int=2):Boolean= n match
        case x if(x==p) => true
        case x if gcd(p,x)=> false
        case x => prime(p,x+1)

    def primeSeq(p:Int,n:Int):Unit={
        if(prime(p)) println(p+"is a prime number")
        if(p<n) primeSeq(p+1,n)
    }

    
    
}

object 
")
file://<WORKSPACE>/lecturesCode/blast.scala
file://<WORKSPACE>/lecturesCode/blast.scala:32: error: expected identifier; obtained eof

^
#### Short summary: 

expected identifier; obtained eof