package Denis.HackerRank

import scala.io.StdIn

object HRank_mini_max_sum {

  def main(args: Array[String]) {

    val arr = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)

    miniMaxSum(arr)
  }

  //  def miniMaxSum(arr: Array[Int]) {
  //        val a = arr.sorted
  //        val x = a.take(4).sum
  //        val y = a.takeRight(4).sum
  //        println(s"$x $y")
  //  }
  //def miniMaxSum(arr: Array[Int]) {
  //    val x = arr.sum - arr.max
  //    val y = arr.sum - arr.min
  //    println(s"$x $y")
  //  }
  def miniMaxSum(arr: Array[Int]) {
    val ar = arr.filter(el => el < 1000000000 || el > 1)
    val x = ar.sum - ar.max
    val y = ar.sum - ar.min
    println(s"$x $y")
  }
}
