package Implementation

import scala.io.StdIn

object MigratoryBirds extends App {

  val arrCount = StdIn.readLine.trim.toInt

  val arr = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)

  val result = migratoryBirds(arr)

  println(result)

  def migratoryBirds(arr: Array[Int]): Int = {
    // Write your code here

    val arrGroup = arr.groupBy(a=>a).map(x=>(x._1,x._2.length))

    val maxGroup = arrGroup.foldLeft((0,0))((a,b)=> {

      if (a._2 < b._2) b
      else a

    })

    maxGroup._1
  }
}
