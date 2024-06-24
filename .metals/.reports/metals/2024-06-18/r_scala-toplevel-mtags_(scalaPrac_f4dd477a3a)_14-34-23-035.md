error id: file://<WORKSPACE>/lecturesCode/max.scala:[656..656) in Input.VirtualFile("file://<WORKSPACE>/lecturesCode/max.scala", "def max(x:Int,y:Int):Int=if (x>y) x else y

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

def 

")
file://<WORKSPACE>/lecturesCode/max.scala
file://<WORKSPACE>/lecturesCode/max.scala:30: error: expected identifier; obtained eof

^
#### Short summary: 

expected identifier; obtained eof