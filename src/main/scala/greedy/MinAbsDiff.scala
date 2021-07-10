package greedy

import scala.io.StdIn

object MinAbsDiff extends App{
  val arr = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)

  val result = minimumAbsoluteDifference(arr)

  println(result)


  def minimumAbsoluteDifference(arr: Array[Int]): Int = {
    // Write your code here

    val arr1 =arr.sorted

    (0 until arr1.size -1).map( i => (arr1(i) - arr1(i+1)).abs).min

  }
}
