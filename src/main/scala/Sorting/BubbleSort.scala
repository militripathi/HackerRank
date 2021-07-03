package Sorting

object BubbleSort extends App{


  val arr = Array(1, 2, 3)

  countSwaps(arr)
  def countSwaps(a: Array[Int]) {
    // Write your code here

    var swaps = 0

    for (i <- 0 until a.length-1){
      for (j <- 0 until a.length-i-1) {
      if (a(j) > a(j+1)) {
        val temp = a(j)
        a(j) = a(j + 1)
        a(j + 1) = temp
        swaps += 1
      }
      }
    }

    println(s"Array is sorted in $swaps swaps.")
    println(s"First Element: ${a(0)}")
    println(s"Last Element: ${a(a.length-1)}")

  }


}
