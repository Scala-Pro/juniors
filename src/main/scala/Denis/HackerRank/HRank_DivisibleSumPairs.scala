package Denis.HackerRank

import scala.io.StdIn

object HRank_DivisibleSumPairs {
  def main(args: Array[String]) {

    val firstMultipleInput = StdIn.readLine.replaceAll("\\s+$", "").split(" ")

    val n = firstMultipleInput(0).toInt

    val k = firstMultipleInput(1).toInt

    val ar = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)

    val result = divisibleSumPairs(n, k, ar)

    println(result)
  }

  def divisibleSumPairs(n: Int, k: Int, ar: Array[Int]): Int = {
    // Write your code here 1 3 2 6 1 2
    var count = 0
    for {
      i <- ar.indices
      j <- i + 1 until n
    } {
        if ((ar(i) + ar(j)) % k == 0) {
          count += 1
        }
    }
    count
  }
}
