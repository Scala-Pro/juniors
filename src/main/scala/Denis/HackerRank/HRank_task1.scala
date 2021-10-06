package Denis.HackerRank

import scala.io.StdIn

object HRank_task1 {
  def main(args: Array[String]) {
    val n = StdIn.readLine.trim.toInt
    staircase(n)
  }

  def staircase(n: Int) {
    // Write your code here
    for (i <- 1 to n) {
      println(" " * (n - i) + "#" * i)
    }
  }
}
