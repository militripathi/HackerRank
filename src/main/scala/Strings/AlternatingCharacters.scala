package Strings

import scala.io.StdIn

/*Sample Input

5
AAAA
BBBBB
ABABABAB
BABABA
AAABBB

Sample Output

3
4
0
0
4

 */


object AlternatingCharacters extends App {

  val q = StdIn.readLine.trim.toInt

  for (qItr <- 1 to q) {
    val s = StdIn.readLine

    val result = alternatingCharacters(s)

    println(result)
  }

  def alternatingCharacters(s: String): Int = {
    // Write your code here

    var str = s.charAt(0)
    var del = 0

    s.tail.foreach { c => {
      if ( c == str) del +=1
      else str = c
      }
    }

    del
  }
}
