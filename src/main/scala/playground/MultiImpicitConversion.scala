package playground


/**
Exercise-1- Create a class customString that takes a string as input and has a method called findLength that returns length of the string.
Now create an implicit function that takes string as input and return an object of type customString.
Create another function testStr that takes string as input and calls findLength method on the inputted string and prints it.

Exercise-2- Create one more class customInt that takes input as integer and has multiply method to return multiplication by 10.
Then create a implicit function that takes a string and returns an object of type customInt.
Create another function testInt that takes string as input and calls multiply method on the inputted string and prints it.

***/
class customString(s:String){
  def findLength=s.length
  println(findLength)

}

class customInt(num:Int){
  def multiply=num*10
  println(multiply)

}


object MultiImpicitConversion extends App{

implicit def toCustomStr(s:String)=new customString(s)
// here is a function defined that takes input as string and returns an object of type customString
  implicit def strToint(s:String)=s.length
implicit def toCustomInt(s:String)=new customInt(s)
  def testInt(var1:String): Unit ={
    var1.multiply
  }

  testInt("abhimanyu")
  def testStr(var1:String){
    var1.findLength
  }

  testStr("Abhimanyu")

}
