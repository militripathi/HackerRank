package Implementation

import scala.io.StdIn

object DrawingBook extends App{

  val n = StdIn.readLine.trim.toInt

  val p = StdIn.readLine.trim.toInt

  val result = pageCount(n, p)

  println(result)

  def pageCount(n: Int, p: Int): Int = {
    // Write your code here

    val fromfront = p/2

    val fromBack = if (n%2 == 0) (n+1 - p)/2 else (n-p)/2
    List(fromfront, fromBack).min
  }

}
