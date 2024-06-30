// def profit(x:Int):Int=x match
//     case x if (x==10) => (140*7)-500
//     case x if (x==15) => (120*12)-500
//     case x if (x==20) => (100*17)-500

// def profit1(price:Int,count:Int):Int= (count*(price-3))-500

def attendees(price:Int):Int=120+(15-price)/5*20

def revenue(price:Int):Int = attendees(price)*price

def cost(price:Int):Int=500+attendees(price)

def profit(price:Int):Int = revenue(price)- cost(price)

//print(profit(5), profit(10), profit(15),profit(20))
//print(profit(25), profit(30), profit(35),profit(40))