package LinkedLists
import java.io._
class SinglyLinkedListNode(var data: Int, var next: SinglyLinkedListNode = null) {
}

class SinglyLinkedList(var head: SinglyLinkedListNode = null, var tail: SinglyLinkedListNode = null) {
  def insertNode(nodeData: Int) = {
    val node = new SinglyLinkedListNode(nodeData)

    if (this.head == null) {
      this.head = node
    } else {
      this.tail.next = node
    }

    this.tail = node
  }
}



object Insert extends App{

  val stdin = scala.io.StdIn
  val printWriter = new PrintWriter(System.out)

  val llist = new SinglyLinkedList()

  val llistCount = stdin.readLine.trim.toInt

  for (_ <- 0 until llistCount) {
    val llistItem = stdin.readLine.trim.toInt
    llist.insertNode(llistItem)
  }

  val data = stdin.readLine.trim.toInt

  val position = stdin.readLine.trim.toInt

  val llist_head = insertNodeAtPosition(llist.head, data, position)

  printSinglyLinkedList(llist_head, " ", printWriter)
  printWriter.println()

  printWriter.close()

  def insertNodeAtPosition(llist: SinglyLinkedListNode, data: Int, position: Int): SinglyLinkedListNode = {

    // Write your code here

    val node = new SinglyLinkedListNode(data)
    var prevNode = llist

    if (llist == null) return node

    if (position == 0){

      node.next = llist

      return node
    }

    var currPos = 0
    while(prevNode.next != null && currPos < position -1) {

      prevNode = prevNode.next
      currPos +=1
    }

    node.next = prevNode.next
    prevNode.next = node

    llist
  }


  def printSinglyLinkedList(head: SinglyLinkedListNode, sep: String, printWriter: PrintWriter) = {
    var node = head

    while (node != null) {
      printWriter.print (node.data)

      node = node.next

      if (node != null) {
        printWriter.print (sep)
      }
    }
  }
}
