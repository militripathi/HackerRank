package Implementation

import scala.io.StdIn

object DayProgrammer extends App {

  val year = StdIn.readLine.trim.toInt

  val result = dayOfProgrammer(year)

  println(result)

  def dayOfProgrammer(year: Int): String = {
    // Write your code here

    var day = ""
    if (year == 1918)
      day = "26.09.1918"
    else if((year < 1918 && year%4 == 0) || (year%400 == 0) ||(year % 4 == 0 && year %100 != 0))
      day = s"12.09.$year"
    else day = s"13.09.$year"

    day
  }

}
