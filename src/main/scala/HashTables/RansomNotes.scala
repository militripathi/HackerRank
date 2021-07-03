package HashTables

object RansomNotes extends App {


//  val mag = Array("give", "me", "one", "grand", "today","night")
//   val note = Array("give", "one", "grand","today")

//  val mag = Array("two", "times", "three", "is", "not", "four")
//  val note =  Array("two", "times", "two", "is", "four")

  val mag = Array("ive", "got", "a", "lovely", "bunch", "of", "coconuts")
   val note = Array("ive", "got", "some", "coconuts")

    checkMagazine(mag,note)

  def checkMagazine(magazine: Array[String], note: Array[String]) {
    // Write your code here
//    groupBy(n => n).map(_._2.length)
    val c1 = magazine.groupBy(x => x).map(x=>(x._1,x._2.length))
    val c2 = note.groupBy(x=>x).map(x=>(x._1,x._2.length))

    var flag = "Yes"
    for ( x <- c2){

//      println(s"${c1(x._1)} ${x._1} ${x._2}")


      if (!c1.contains(x._1)) flag = "No"
      else if (c1(x._1) < x._2) flag = "No"

//      println(c1(x._1))
    }

    println(s" Flag: $flag")


    println(s"c1: $c1  c2: $c2")

  }

}
