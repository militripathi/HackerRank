package Implementation

import scala.io.StdIn

object UtopianTree extends App{

  val t = StdIn.readLine.trim.toInt

  for (tItr <- 1 to t) {
    val n = StdIn.readLine.trim.toInt

    val result = utopianTree(n)

    println(result)
  }

  def utopianTree(n: Int): Int = {
    // Write your code here

    def height(currCycle:Int ,h:Int):Int={

      if (currCycle == n) h
      else if (currCycle %2 == 0) height(currCycle+1,h*2)
      else height(currCycle+1,h+1)

    }

    height(0,1)
  }
}
