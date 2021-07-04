package StacksQueues

import scala.collection.immutable.HashMap
import scala.collection.mutable
import scala.io.StdIn

object BalancedBrackets extends App{

  val t = StdIn.readLine.trim.toInt

  for (tItr <- 1 to t) {
    val s = StdIn.readLine

    val result = isBalanced(s)

    println(result)
  }

  def isBalanced(s: String): String = {
    // Write your code here

    val stack = new mutable.Stack[Char]
    val brace = HashMap('(' -> ')','[' -> ']','{' -> '}')

    s.map(c=> {

      if (brace.contains(c)) stack.push(c)
      else{
        if (stack.isEmpty) return "NO"
        if (brace.get(stack.pop) != Some(c)) return "NO"


      }
    })

    if (stack.isEmpty) return "YES"
    else return "NO"
  }

}
