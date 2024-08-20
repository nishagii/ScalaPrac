object InterestCalculator{

    val interestRate1: Double => Double = amount => amount * 0.02
    val interestRate2: Double => Double = amount=> amount * 0.04
    val interestRate3: Double => Double = amount => amount * 0.035      
    val interestRate4: Double => Double = amount => amount * 0.065


    def calculateInterest(deposit:Double):Double={
        deposit match {
            case x if x<=20000 => interestRate1(x);
            case x if x<=200000 => interestRate2(x);
            case x if x<=2000000 => interestRate3(x);
            case x => interestRate4(x);
        }
    }

    def main(args:Array[String]):Unit={
        print("Enter the deposit amount : ")
        val amount= scala.io.StdIn.readDouble();
        val interest = calculateInterest(amount);

        println(s"The interest for a deposit of Rs. $amount is Rs.$interest")

    }
}

