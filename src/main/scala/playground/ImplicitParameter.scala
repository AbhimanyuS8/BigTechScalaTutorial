package playground

object ImplicitParameter extends App {

implicit val test=5  // implicit parameter

implicit def strToInt(s:String)=s.length

  // implicit conversion
  def find(x:Int)=x

  println(find("Abhimanyu"))

}
