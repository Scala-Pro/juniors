package Denis.HackerRank

import scala.io.StdIn

object HRank_CompareTriplets {
  def main(args: Array[String]) {
    val a = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)

    val b = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)

    val result = compareTriplets(a, b)

    println(result.mkString(" "))

  }

  def compareTriplets(a: Array[Int], b: Array[Int]): Array[Int] = {
    // Write your code here
    var c1 = 0
    var c2 = 0
    for (i <- a.indices) {
      if (a(i) > b(i)) {
        c1 += 1
      } else if (b(i) > a(i)) {
        c2 += 1
      }
    }
    Array(c1, c2)
  }
}
