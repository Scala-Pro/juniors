package Denis.HackerRank

import scala.collection.mutable.ListBuffer
import scala.io.StdIn

object HRank_Diagonal_Difference {
  def main(args: Array[String]): Unit = {
    val n = StdIn.readLine.trim.toInt

    val arr = Array.ofDim[Int](n, n)

    for (i <- 0 until n) {
      arr(i) = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)
    }

    val result = diagonalDifference(n, arr)
    println(result)
  }

  // IMPERATIVE STYLE

  //  def diagonalDifference(n: Int, arr: Array[Array[Int]]): Int = {
  //    var countA = 0
  //    var countB = 0
  //    for ((i, j) <- arr.indices zip arr.indices) yield {
  //      countA += arr(i)(j)
  //      countB += arr(i)(n - j - 1)
  //    }
  //    Math.abs(countA - countB)
  //  }

  //FUNCTIONAL STYLE

  def diagonalDifference(n: Int, arr: Array[Array[Int]]): Int = {
    val listA = new ListBuffer[Int]()
    val listB = new ListBuffer[Int]()

    for ((i, j) <- arr.indices zip arr.indices) {
      listA += arr(i)(j)
      listB += arr(i)(n - j - 1)
    }
    Math.abs(listA.sum - listB.sum)
  }
}
