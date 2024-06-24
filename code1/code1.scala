//1 
def area(r: Double): Double = math.Pi * r * r
//2
def far(c:Double):Double= c*1.8+32
//3
def vol(r:Double):Double=r*r*r*math.Pi*4/3
//4
def disc(i:Double):Double=24.95*0.6*i
def ship(i:Int):Double= if (i<50) 3 else {(i-50)*0.75+3}
def tot(i:Int):Double=disc(i)+ship(i)
//5
def easy(e:Double):Double=e/8.0
def tempo(t:Double):Double=t/7.0
def total(e:Double,t:Double)=easy(e)+tempo(t)


