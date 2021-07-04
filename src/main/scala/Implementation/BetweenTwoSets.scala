package Implementation

import scala.io.StdIn

import Array._
/*
Sample Input

2 3
2 4
16 32 96
Sample Output

3

 */

object BetweenTwoSets extends App{

  val firstMultipleInput = StdIn.readLine.replaceAll("\\s+$", "").split(" ")

  val n = firstMultipleInput(0).toInt

  val m = firstMultipleInput(1).toInt

  val arr = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)

  val brr = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)

  val total = getTotalX(arr, brr)

  println(total)

  def getTotalX(a: Array[Int], b: Array[Int]): Int = {
    // Write your code here

    val allNum = (a.max to b.min).toArray

    val Total = allNum.filter(num => a.forall(i => num % i == 0) && b.forall(j=> j%num == 0))

   Total.size

  }

}
