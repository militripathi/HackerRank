package warmups

object RepeatedString extends App{

  val s = "aba"
  val n = 10

  val times = n/s.length
  val rest = n % s.length
  val aCount = s.count(_ == 'a')

  val result = aCount * times + s.substring(0,rest.toInt).count(_ == 'a')

  println(result)


}
