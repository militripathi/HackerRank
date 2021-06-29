package warmups

object CountingValleys extends App{


  val steps = 12
  val path = "DDUUDDUDUUUD"

  var valleys = 0
  var seaLevel = 0
  path.foreach(c=>
  {
    if (c == 'D') seaLevel-=1
    else seaLevel+=1
    if (seaLevel == 0 && c== 'U') valleys+=1

  }

  )

  println(valleys)
}
