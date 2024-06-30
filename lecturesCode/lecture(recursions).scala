// object blast extends App{
//     def blast(n:Int):Unit={
//         if(n>1) blast(n-1)
//         else println("Blastoff!!")
//         println(n)
//     }
//     blast(3)
// }

object gcd extends App {
  
  // GCD function
  def gcd(a: Int, b: Int): Int = b match {
    case 0 => a
    case x if x > a => gcd(x, a)
    case _ => gcd(b, a % b)
  }

  // Prime function
  def prime(p: Int, n: Int = 2): Boolean = n match {
    case x if x >= p => true
    case x if gcd(p, x) != 1 => false
    case x => prime(p, x + 1)
  }

  // Prime sequence function
  def primeSeq(p: Int, n: Int): Unit = {
    if (p <= n) {
      if (prime(p)) println(p + " is a prime number")
      primeSeq(p + 1, n)
    }
  }

  // Test the prime sequence from 1 to 20
  primeSeq(1, 100)
}


// object power extends App{
//     def power(n:Int,p:Int)={
//         if (p==0) 1
//         else(n*power(n,p-1))
//     }
// 4321
//321
//21
//1