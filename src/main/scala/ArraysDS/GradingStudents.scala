package ArraysDS

object GradingStudents extends App {

  val n=4
  val grades1 = Array[Int](73,67,38,33)

  gradingStudents(grades1)
  def gradingStudents(grades: Array[Int]): Array[Int] = {
    // Write your code here

    var roundGrades = Array.ofDim[Int](grades.length)
    for(i <- grades.indices) {

      if (grades(i) % 5 >=3 && grades(i) >= 38 ) roundGrades(i) = grades(i) + (5 - (grades(i)%5))
      else roundGrades(i) = grades(i)

      println(s" grades: ${grades(i)} roungGrades: ${roundGrades(i)}")
    }

    roundGrades
  }
}
