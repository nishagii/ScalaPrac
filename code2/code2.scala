var k, i, j = 2
var m, n = 5
var f = 12.0f
var g = 4.0f
var c = 'X'

var a = 2;
var b = 3;
var C = 4;
var d = 5;

var K = 4.3f;

// def incre(x: Int): Int = x + 1;
// def decre(x: Int): Int = x - 1;

//x++
def postin(x: Int) = {
  println(x);
  x + 1;
}
//++x
def prein(x: Int) = {
  val incremented = x + 1;
  println(incremented);
  incremented;
}
//x--
def postde(x: Int) = {
  println(x);
  x - 1;
}
//--x
def prede(x: Int) = {
  val decremented = x - 1;
  println(decremented);
  decremented;
}
