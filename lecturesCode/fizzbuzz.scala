object fizzbuzz{
    def numbers(n:Int,m:Int):Unit={
        println(n)
        if(n<m){numbers(n+1,m)}
    }

    def main(args:Array[String]):Unit=(
        numbers(1,100)
    )
}

object fibonacci{
    def fib(n:Int):Int=n match{
        case x if x==0 => 0
        case x if x==1=> 1
        case x => fib(n-1)+fib(n-2)
    }
    def main(args:Array[String]):Unit=(
        fib(100)
    )
}

