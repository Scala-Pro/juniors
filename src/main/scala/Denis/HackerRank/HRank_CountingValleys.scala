package Denis.HackerRank

import scala.io.StdIn

object HRank_CountingValleys {
  def main(args: Array[String]) {
    val steps = StdIn.readLine.trim.toInt

    val path = StdIn.readLine

    val result = countingValleys(steps, path)

   println(result)
  }

  def countingValleys(steps: Int, path: String): Int = {
    // Write your code here
    var level = 0
    var valleys = 0

    for (i <- path) {
      if (i == 'U') {
        level += 1
        if (level == 0) {
          valleys += 1
        }
      } else {
        level -= 1
      }
    }
    valleys
  }
}
