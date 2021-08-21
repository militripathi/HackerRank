package Implementation

import scala.collection.mutable.ListBuffer
import scala.io.StdIn

object ViralAdvertising extends App{

  val n = StdIn.readLine.trim.toInt

  val result = viralAdvertising(n)

  println(result)

  def viralAdvertising(n: Int): Int = {
    // Write your code here

    var likes = ListBuffer[Int]()

    var receipents = 5

    for (i<- 0 until n){

      var liked: Int =receipents/2
      var receipentsNext = liked * 3
      receipents = receipentsNext
      likes = likes:+liked
    }

    val totLikes = likes.sum

    totLikes

  }

}
