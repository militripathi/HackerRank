package Implementation

import scala.io.StdIn

object DivisibleSumPairs extends App {

  val firstMultipleInput = StdIn.readLine.replaceAll("\\s+$", "").split(" ")

  val n = firstMultipleInput(0).toInt

  val k = firstMultipleInput(1).toInt

  val ar = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)

  val result = divisibleSumPairs(n, k, ar)

  println(result)

  def divisibleSumPairs(n: Int, k: Int, ar: Array[Int]): Int = {
    // Write your code here

    val indexesPair = ar.indices.flatMap(i=>ar.indices.slice(i+1,ar.length).map(j=>(i,j)))

    val divisiblePair = indexesPair.count(i=> (ar(i._1) + ar(i._2)) % k == 0)

    divisiblePair

  }

}
