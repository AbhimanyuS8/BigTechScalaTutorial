package training

class Counter {

  private var sum=0
  def Inc(by:Int=1) ={

    sum+=by  // sum = sum+by

  }
def Dec(by:Int=1)={
  // by is of type val
  sum-=by

}

}

object Counter{

  val oo=new Counter()
  def InoBy(by:Int)={
    for(i<- 1 to by)
      oo.Inc()
    oo.sum
      }
  def DecoBy(by:Int)={
    for(i<- 1 to by)
      oo.Dec()
    oo.sum
  }
}