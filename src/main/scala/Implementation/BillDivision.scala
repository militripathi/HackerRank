package Implementation

import scala.io.StdIn

object BillDivision extends App{

  val firstMultipleInput = StdIn.readLine.replaceAll("\\s+$", "").split(" ")

  val n = firstMultipleInput(0).toInt

  val k = firstMultipleInput(1).toInt

  val bill = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)

  val b = StdIn.readLine.trim.toInt

   bonAppetit(bill, k, b)

  def bonAppetit(bill: Array[Int], k: Int, b: Int) {
    // Write your code here

    val actualBill = (bill.sum - bill(k))/2

    if (actualBill == b) println("Bon Appetit")
    else println(b-actualBill)

  }

}
