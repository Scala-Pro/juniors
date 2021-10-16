package Denis.HackerRank

import scala.io.StdIn

object HRank_PlusMinus {
  def main(args: Array[String]) {
    val n = StdIn.readLine.trim.toInt

    val arr = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)

    plusMinus(arr)
  }

  def plusMinus(arr: Array[Int]) {
    // Write your code here
    val plusesC = arr.toList.count(_ > 0).toDouble
    val minusesC = arr.toList.count(_ < 0).toDouble
    val zerosC = arr.toList.count(_ == 0).toDouble

    println(f"${plusesC / arr.length}%1.4f")
    println(f"${minusesC / arr.length}%1.4f")
    println(f"${zerosC  / arr.length}%1.4f")
  }
}
