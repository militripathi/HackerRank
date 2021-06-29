package warmups

object JumpingCloud extends App{

  val n = 6
  val c = Array[Int](0, 0, 0, 0, 1, 0)

  var index = 0
  var steps = 0
  while(index < c.length -1) {

    if (((index + 2) < c.length) && (c(index + 2 ) != 1)){

      index +=2
    } else index +=1

    steps +=1

  }

  println(steps)
}
