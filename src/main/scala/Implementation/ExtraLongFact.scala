package Implementation

import scala.io.StdIn

object ExtraLongFact extends App{

  val n = StdIn.readLine.trim.toInt

  extraLongFactorials(n)

  def extraLongFactorials(n: Int) {
    // Write your code here

      println(fact(n))

  }

  def fact(n:Int):BigInt ={
    if (n < 1) 1
    else n*(fact(n-1))

  }
}
