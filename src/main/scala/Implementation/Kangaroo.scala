package Implementation

import scala.io.StdIn
//
//Test case 1 : Input 0 3 4 2 Output YES
//Test case 2 : Input 0 2 5 3 Output NO

object Kangaroo extends App{

  val firstMultipleInput = StdIn.readLine.replaceAll("\\s+$", "").split(" ")

  val x1 = firstMultipleInput(0).toInt

  val v1 = firstMultipleInput(1).toInt

  val x2 = firstMultipleInput(2).toInt

  val v2 = firstMultipleInput(3).toInt

  val result = kangaroo(x1, v1, x2, v2)

  println(result)


  def kangaroo(x1: Int, v1: Int, x2: Int, v2: Int): String = {
    // Write your code here
    // x1 always < x2
    var sameLoc = "NO"
    if (v2 >= v1) sameLoc = "NO"
    else {

      val xDiff = (x1-x2).abs
      val vDiff = (v1-v2).abs

      if (xDiff % vDiff == 0) sameLoc = "YES"
      else sameLoc = "NO"


    }

    sameLoc
  }

}
