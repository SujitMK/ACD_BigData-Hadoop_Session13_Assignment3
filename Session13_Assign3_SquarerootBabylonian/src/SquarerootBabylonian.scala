

object SquarerootBabylonian {
  
  // the method is used to get square root of a number using babylonian
  
  def squareroot(num:Int): Unit =
  {
    var x:Float = num
    var y:Float = 1
    val z:Double= 0.000001
    
    while(x-y>z)
    {
      x=(x+y)/2
      y=num/x 
    }
    println("")
    println("The Square root of a number "+ num +" is : "+x)
  }
  
  def main(args:Array[String])
  {
    println("Enter the number to Square")
    println("")
    var num= readInt()
    squareroot(num)
  }
  
}