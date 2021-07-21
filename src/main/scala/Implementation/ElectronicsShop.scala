package Implementation

object ElectronicsShop extends App{

  val stdin = scala.io.StdIn

  val bnm = stdin.readLine.split(" ")

  val b = bnm(0).trim.toInt

  val n = bnm(1).trim.toInt

  val m = bnm(2).trim.toInt

  val keyboards = stdin.readLine.split(" ").map(_.trim.toInt)

  val drives = stdin.readLine.split(" ").map(_.trim.toInt)
  /*
   * The maximum amount of money she can spend on a keyboard and USB drive, or -1 if she can't purchase both items
   */

  val moneySpent = getMoneySpent(keyboards, drives, b)

  println(moneySpent)


  def getMoneySpent(keyboards: Array[Int], drives: Array[Int], b: Int): Int = {
    /*
     * Write your code here.
     */

    val allLessThanb = (for{

      i <- 0 until keyboards.length
      j <- 0 until drives.length }

      yield(i,j)).toList.filter(x => keyboards(x._1) + drives(x._2) <= b)

    val sum = if (allLessThanb.isEmpty) { -1} else
      {

        val indexes = allLessThanb.maxBy(a=> keyboards(a._1) + drives(a._2))

        keyboards(indexes._1) + drives(indexes._2)
      }

      sum

  }


}
