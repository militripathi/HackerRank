package StacksQueues

import java.util.Scanner

import scala.collection.mutable
import scala.io.StdIn

object TaleOfTwoStacks extends App{

  class MyQueue[T]{

    val stackNewestOnTop = mutable.Stack[T]()
    val stackOldestOnTop = mutable.Stack[T]()

    def enqueue(value:T): Unit ={

      stackNewestOnTop.push(value)
    }

    def peek():T={
      transferStack()
      stackOldestOnTop.top

    }

    def dequeue():T={

      transferStack()

      stackOldestOnTop.pop()

    }

    def transferStack():Unit ={

      if (!stackOldestOnTop.isEmpty) return
      while(!stackNewestOnTop.isEmpty){

        stackOldestOnTop.push(stackNewestOnTop.pop())
      }

    }
  }


    val queue = new MyQueue[Int]()

    val scan = new Scanner(System.in);
    val n = scan.nextInt();

    for ( i<- 0 until n){

      val operation = scan.nextInt()
      if (operation == 1) queue.enqueue(scan.nextInt())
      if (operation == 2) queue.dequeue()
      if (operation== 3) println(queue.peek())
    }

    scan.close()

}
