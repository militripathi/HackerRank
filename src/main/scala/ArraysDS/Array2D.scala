package ArraysDS

import scala.collection.mutable.ArraySeq
//import Array._

object Array2D extends App {
  //  def apply(i: Int, i1: Int, i2: Int, i3: Int, i4: Int, i5: Int) = ???


  val a = Array(Array(1, 1, 1, 0, 0, 0),
    Array(0, 1, 0, 0, 0, 0),
    Array(1, 1, 1, 0, 0, 0),
    Array(0, 0, 2, 4, 4, 0),
    Array(0, 0, 0, 2, 0, 0),
    Array(0, 0, 1, 2, 4, 0))

  println(hourglassSum(a))

  def hourglassSum(arr: Array[Array[Int]]): Int = {
    var maxSum = 0
    for (i <- Range(0, 4)) {
      for (j <- Range(0, 4)) {

        val sum = a(i)(j) + a(i)(j + 1) + a(i)(j + 2) + a(i + 1)(j + 1) + a(i + 2)(j) + a(i + 2)(j + 1) + a(i + 2)(j + 2)

        if (i == 0 && j == 0) maxSum = sum
        if (sum > maxSum) maxSum = sum

      }


    }
    maxSum

  }

}



