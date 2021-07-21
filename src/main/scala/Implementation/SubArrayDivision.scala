package Implementation

import scala.io.StdIn

object SubArrayDivision extends App{

  val n = StdIn.readLine.trim.toInt

  val s = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)

  val firstMultipleInput = StdIn.readLine.replaceAll("\\s+$", "").split(" ")

  val d = firstMultipleInput(0).toInt

  val m = firstMultipleInput(1).toInt

  val result = birthday(s, d, m)

  println(result)


  def birthday(s: Array[Int], d: Int, m: Int): Int = {
    // Write your code here

    val choco = s

    val allConsecutives = choco.sliding(m)

    allConsecutives.count(x=>x.sum == d)


  }

}
