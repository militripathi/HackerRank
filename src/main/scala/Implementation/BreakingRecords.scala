package Implementation

import scala.io.StdIn

object BreakingRecords extends App {

  val n = StdIn.readLine.trim.toInt

  val scores = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)

  val result = breakingRecords(scores)

  println(result.mkString(" "))


  def breakingRecords(scores: Array[Int]): Array[Int] = {
    // Write your code here

    var max = scores(0)
    var min = scores(0)

    var break = Array.ofDim[Int](2)

    for(i<- 1 until scores.length){

      if (scores(i) < min) {

        min = scores(i)
        break(1) += 1
      }

      if (scores(i) > max) {

        max = scores(i)
        break(0) += 1
      }

    }

    break

  }

}
