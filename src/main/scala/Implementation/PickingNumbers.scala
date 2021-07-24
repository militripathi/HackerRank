package Implementation
import scala.util.control.Breaks._
import scala.io.StdIn

object PickingNumbers extends App{


  val n = StdIn.readLine.trim.toInt

  val a = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)

  val result = pickingNumbers(a)

  println(result)

  def pickingNumbers(a: Array[Int]): Int = {
    // Write your code here

    val aSort = a.sorted

    var maxSubArray = 0

    for (i<- 0 until aSort.length){

      breakable{
          for (j<- i+1 until aSort.length)
            {
              if ((aSort(i) - aSort(j)).abs > 1) break
              val subArraylen = j - i
              maxSubArray = Array(subArraylen, maxSubArray).max
            }

      }
    }

    maxSubArray + 1

  }

}
