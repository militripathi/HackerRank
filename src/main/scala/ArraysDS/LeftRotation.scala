package ArraysDS

import scala.collection.mutable.ArrayBuffer

object LeftRotation extends App {

  val arr = Array(1, 2, 3, 4, 5)
  val rot = 4

  rotLeft(arr,rot)

  def rotLeft(a: Array[Int], d: Int): Array[Int] = {
    // Write your code here

    var aout = Array.ofDim[Int](a.length)
    for(i<-Range(0,a.length)){

      val newloc = (i+(a.length - d))% a.length
      aout(newloc) = a(i)


//
//      println(aout(newloc))

    }

    println(aout.mkString(" "))
    aout
  }

}
