package Implementation

import scala.io.StdIn

object AngryProfessor extends App{


  val t = StdIn.readLine.trim.toInt

  for (tItr <- 1 to t) {
    val firstMultipleInput = StdIn.readLine.replaceAll("\\s+$", "").split(" ")

    val n = firstMultipleInput(0).toInt

    val k = firstMultipleInput(1).toInt

    val a = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)
    val result = angryProfessor(k, a)

    println(result)
  }

  def angryProfessor(k: Int, a: Array[Int]): String = {
    // Write your code here

      val classCount = a.count( _<=0)

      if (classCount >= k) "NO"
      else "YES"

  }


}
