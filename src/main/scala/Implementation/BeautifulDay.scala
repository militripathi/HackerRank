package Implementation

import scala.io.StdIn

object BeautifulDay extends App{

  val firstMultipleInput = StdIn.readLine.replaceAll("\\s+$", "").split(" ")

  val i = firstMultipleInput(0).toInt

  val j = firstMultipleInput(1).toInt

  val k = firstMultipleInput(2).toInt

  val result = beautifulDays(i, j, k)

  println(result)

  def beautifulDays(i: Int, j: Int, k: Int): Int = {
    // Write your code here

      val beautifulDay = (i to j).count(num => {

        val reverseNum = num.toString.reverse.toInt

        val diff = (num -reverseNum).abs

        diff % k == 0

      })
    beautifulDay
  }

}
