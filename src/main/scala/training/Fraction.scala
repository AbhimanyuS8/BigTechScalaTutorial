package training

class Fraction(n:Int,d:Int) {
  val numer=n
  val denom=d
  def add(that:Fraction):Fraction={
    new Fraction(numer * that.denom+ denom*that.numer,
      denom*that.denom)
  }
    def sub(that:Fraction):Fraction={
      new Fraction(numer * that.denom- denom*that.numer,
        denom*that.denom)
    }

//    n1/d1 + n2/d2 = (n1*d2 + d1*n2)/d1*d2
  }

object Operation extends App {

  val x= new Fraction(2,3)
  val y= new Fraction(4,5)
  val z=x.add(y)
  println("The added value is : " + z.numer + "/" + z.denom)
  val sub=y.sub(x)
  println("The subtracted value is : " + sub.numer + "/" + sub.denom)

}