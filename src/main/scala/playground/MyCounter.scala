package playground
import Counter.{IncBy,DecBy}

object MyCounter {
  def main(args: Array[String]): Unit = {

val o= new Counter()

    println(" Increment by 10 - " + IncBy(10))
    println(" Increment by 10 - " + IncBy(10))
    println(" Decrement by 5 - " + DecBy(5))
  }


}






