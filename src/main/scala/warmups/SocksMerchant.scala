package warmups

// Get the pairs and find the total number of pairs
object SocksMerchant extends App {
  val arr = Array[Int](10, 20, 20, 10, 10, 30, 50, 10, 20)

  val Sockgrouppairs = arr.groupBy(i=>i).map(gp=>gp._2.length/2)

  val pairs = Sockgrouppairs.sum

  println("output:" + pairs)


}
