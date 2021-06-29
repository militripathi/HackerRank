package warmups

import scala.collection.mutable.ListBuffer

//Find Minimum and Maximum sum of 4 elements from Array of 5
object MinMaxSum extends App{


//  val inArray = Array[Int](1,3,5,7,9)

    val inArray = Array[Int](1,2,3,4,5)

  var outList = new ListBuffer[Double]()

  for ( i <- 0 to (inArray.length - 1)){

//    println(i + " " + inArray(i))
    var sum:Double = 0
    for ( j <- 0 to (inArray.length - 1)){

      if (i!=j)
        sum += inArray(j)
    }

//    println("Sum:" + sum)

    outList += sum
  }

  print(outList.min + " " + outList.max)

//  for (x <- outList){
//
//    println("Sum: " + x)
//  }
}
