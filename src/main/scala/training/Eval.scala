package training

object Eval extends App {
var sum: Int =0
  def max(x:Int,y:Int)={
    if(x>y) x
    else y
  }
  def add(x:Int,y:Int):Int={
    x+y
  }

  sum=add(10,12)
  println(max(10,12))
  println(sum)

}
