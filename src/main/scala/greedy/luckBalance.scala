package greedy

import scala.collection.mutable.ListBuffer
import scala.io.StdIn

object luckBalance extends App{

  val firstMultipleInput = StdIn.readLine.replaceAll("\\s+$", "").split(" ")

  val n = firstMultipleInput(0).toInt

  val k = firstMultipleInput(1).toInt

  val contests = Array.ofDim[Int](n, 2)

  for (i <- 0 until n) {
    contests(i) = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)
  }

  val result = luckBalance(k, contests)

  println(result)

  def luckBalance(k: Int, contests: Array[Array[Int]]): Int = {
    // Write your code here

    var importance = ListBuffer[Int]()
    var optional = 0

    for ( x <- contests){

      println(s"x  ${x(0)} ${x(1)}")
      if (x(1) == 1) {
        importance = importance :+ x(0)
      }
      else optional += x(0)
    }

    if ( k < importance.length)
      {

        val l = importance.length
        val sortedImp = importance.sorted
        optional + sortedImp.slice(l-k,l).sum - sortedImp.slice(0,l-k).sum

      }
    else (optional + importance.sum)


  }
}
