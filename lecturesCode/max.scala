def max(x:Int,y:Int):Int=if (x>y) x else y

def pass(m:Int)=if (m>50) "Pass" else "Fail"

def isEven(n:Int)=if (n%2==0) true else false

def maax(x:Int,y:Int):Int= x>=y match
    case true =>x
    case false =>y

def leap(y:Int)=if (y%4==0 && y%100!=0 || y % 400 == 0) "Leap Year" else "Common year"

def leeap(y:Int)=(y%4==0 && y%100!=0 || y % 400 == 0)  match
    case true => "Leap Year"
    case false => "Common Year"

def sign(x:Int)= x match
    case x if (x>0)=>1
    case x if (x==0)=> 0
    case x if (x<0) => -1

def grade(x:Int)= x match
    case x if x>=75 => "A"
    case x if x>=65 => "B"
    case x if x>=75 => "C"
    case _ => "F"

def interest(t:Double)= t match
    case t if t<=1000 => t*0.05
    case t if t<=10000 => t*0.06
    case t if t<=100000 => t*0.07
    case t if t>100000 => t*0.08

def tax(s:Double):Double= s match
    case s if(s<=50000)=> s*0
    case s if(s>50000 && s<=100000)=> s*0.1
    case s if(s>100000)=> s*0.2

def gross(h:Double):Double= 500*h 

def netpay(h:Double):Double=gross(h)-tax(gross(h))



