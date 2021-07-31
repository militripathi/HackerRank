package Implementation

import scala.io.StdIn

object HurdleRace extends App{

  val firstMultipleInput = StdIn.readLine.replaceAll("\\s+$", "").split(" ")

  val n = firstMultipleInput(0).toInt

  val k = firstMultipleInput(1).toInt

  val height = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)

  val result = hurdleRace(k, height)

  println(result)

  def hurdleRace(k: Int, height: Array[Int]): Int = {
    // Write your code here

    val maxheight = height.max

    if (maxheight - k > 0) maxheight - k
    else 0

  }

}
