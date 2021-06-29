package warmups

import java.text.SimpleDateFormat

object Time extends App {

  val s= "12:01:00PM"

  val newTimeFormat = new SimpleDateFormat("hh:mm:ssa")

  val timeWithDateFormat = newTimeFormat.parse(s)

  println(timeWithDateFormat)

//  val s1 = timeWithDateFormat.toString
//
  val outTimeFormat = new SimpleDateFormat("HH:mm")

  val outTime = outTimeFormat.format(timeWithDateFormat)

  print(outTime)
}
