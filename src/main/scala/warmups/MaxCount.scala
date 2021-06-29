package warmups

// Count the occurance of largest number
object MaxCount extends App{

  val inArray = Array[Int](3,2,1,3)

  val maxNum = inArray.max
  println("Max Num : " + maxNum)

  val cnt:Int = inArray.count(x => x == maxNum)

  print(cnt)


}
