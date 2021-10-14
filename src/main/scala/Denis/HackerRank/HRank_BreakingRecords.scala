package Denis.HackerRank

import scala.io.StdIn

object HRank_BreakingRecords {

  def main(args: Array[String]) {
    val n = StdIn.readLine.trim.toInt

    val scores = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)

    val result = breakingRecords(scores)

    println(result.mkString(" "))

  }

  def breakingRecords(scores: Array[Int]): Array[Int] = {
    // Write your code here
    var current = scores(0)
    var currentLow = scores(0)
    var low = 0
    var high = 0

    for (i <- scores.indices) {
      if (scores(i) > current) {
        high += 1
        current = scores(i)
      } else if (scores(i) < currentLow) {
        low += 1
        currentLow = scores(i)
      }
    }

    Array(high, low)
  }

}
