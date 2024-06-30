object rounding{
    def mean(num1:Int,num2:Int):Double={
        val mean=(num1+num2)/2
        BigDecimal(mean).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
    }

    def main(args:Array[String]):Unit={
        val num1=5
        val num2=10
        val mean=rounding.mean(num1,num2)
        println(s"The arithmetic mean of $num1 and $num2 is $mean")
    }
}