package Denis.HackerRank

import scala.collection.mutable.ListBuffer
import scala.io.StdIn

object HRank_GradingStudents {
  def main(args: Array[String]) {
    val gradesCount = StdIn.readLine.trim.toInt

    val grades = Array.ofDim[Int](gradesCount)

    for (i <- 0 until gradesCount) {
      val gradesItem = StdIn.readLine.trim.toInt
      grades(i) = gradesItem
    }

    val result = gradingStudents(grades)

    println(result.mkString("\n"))
  }

  def gradingStudents(grades: Array[Int]): Array[Int] = {
    var list = new ListBuffer[Int]
    for (i <- grades.indices) {
      if (grades(i) < 35) {
        list += grades(i)
      } else if (grades(i) % 5 == 0) {
        list += grades(i)
      }
      else if (grades(i) % 5 > 2) {
        while (grades(i) % 5 != 0) {
          grades(i) += 1
        }
        list += grades(i)
      } else {
        list += grades(i)
      }
    }
    list.toArray
  }
}
