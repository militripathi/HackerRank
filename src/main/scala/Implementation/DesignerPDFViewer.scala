package Implementation

import scala.io.StdIn

object DesignerPDFViewer extends App{


  val h = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)

  val word = StdIn.readLine

  val result = designerPdfViewer(h, word)

  println(result)

  def designerPdfViewer(h: Array[Int], word: String): Int = {
    // Write your code here

    val characterIndexes = word.map(x=>x-'a')

    val maxheight = characterIndexes.map(x=>h(x)).max
    val len = word.length
    maxheight*len

  }
}
