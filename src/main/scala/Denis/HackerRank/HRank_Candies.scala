package Denis.HackerRank

import scala.io.StdIn

object HRank_Candies {
  def main(args: Array[String]) {

    val candlesCount = StdIn.readLine.trim.toInt

    val candles = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)

    val result = birthdayCakeCandles(candles)

    println(result)

  }

  def birthdayCakeCandles(candles: Array[Int]): Int = {
    // Write your code here
    val max = candles.max
    candles.count(_ == max)
  }



}
