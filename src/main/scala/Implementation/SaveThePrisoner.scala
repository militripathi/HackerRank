package Implementation

import scala.io.StdIn

object SaveThePrisoner extends App{

  val t = StdIn.readLine.trim.toInt

  for (tItr <- 1 to t) {
    val firstMultipleInput = StdIn.readLine.replaceAll("\\s+$", "").split(" ")

    val n = firstMultipleInput(0).toInt

    val m = firstMultipleInput(1).toInt

    val s = firstMultipleInput(2).toInt

    val result = saveThePrisoner(n, m, s)

    println(result)
  }

  def saveThePrisoner(n: Int, m: Int, s: Int): Int = {
    // Write your code here

    val warn = ((m-1) + (s-1)) % n + 1
     warn

  }


}
