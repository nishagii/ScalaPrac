//1 
def area(r: Double): Double = math.Pi * r * r
//2
def far(c:Double):Double= c*1.8*32
//3
def vol(r:Double):Double=r*math.Pi*4/3
//4
def disc(x:Double):Double=x*0.6
def ship(i:Int):Double= if (i<50) {i*3} else {(i-50)*0.75+3*50}
def tot(i:Int,x:Double):Double=disc(x)+ship(i)
//5
def easy(e:Double):Double=8*e
def tempo(t:Double):Double=7*t
def total(e:Double,t:Double)=easy(e)+tempo(t)


