package Implementation

object AppleOrange extends App {

  val s= 7
  val t= 11
  val a = 5
  val b = 15

  val apples = Array(-2, 2, 1)
  val oranges = Array(5, -6)

  countApplesAndOranges(7,11,5,14,apples,oranges)
  def countApplesAndOranges(s: Int, t: Int, a: Int, b: Int, apples: Array[Int], oranges: Array[Int]) {
    // Write your code here

    val fallenApples = apples.count(ap=>(a+ap >=s) && (a+ap <= t))
    val fallenOranges = oranges.count(o=>(b+o >=s) && (b+o <= t))

    println(fallenApples)
    println(fallenOranges)

  }
}
