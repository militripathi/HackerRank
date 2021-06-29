package Implementation

object EqualizeArray extends App{

  val array = Array(3, 3, 2, 1, 3)
  val maxOccuredNumber = array.groupBy(n => n).map(_._2.length).max
  val toRemove = array.length - maxOccuredNumber
  println(toRemove)

}
