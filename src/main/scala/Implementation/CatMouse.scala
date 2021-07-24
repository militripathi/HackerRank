package Implementation

object CatMouse extends App{
  val stdin = scala.io.StdIn

  val q = stdin.readLine.trim.toInt

  for (qItr <- 1 to q) {
    val xyz = stdin.readLine.split(" ")

    val x = xyz(0).trim.toInt

    val y = xyz(1).trim.toInt

    val z = xyz(2).trim.toInt

    val result = catAndMouse(x, y, z)

    println(result)



  }

  // Complete the catAndMouse function below.
  def catAndMouse(x: Int, y: Int, z: Int): String = {

    val dist1 = (x-z).abs
    val dist2 = (y-z).abs

    if (dist1 < dist2) "Cat A"
    else if (dist1 > dist2) "Cat B"
    else "Mouse C"

  }
}
