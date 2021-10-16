package Denis.HackerRank

import scala.io.StdIn

object HRank_TimeConversation {
  def main(args: Array[String]) {
    val s = StdIn.readLine

    val result = timeConversion(s)

    println(result)
  }

  def timeConversion(s: String): String = {
    // Write your code here 07:05:45PM 12:01:00AM
    if (s.slice(0, 2) == "12" && s.slice(8, 10) == "AM") {
      "00" + s.slice(2, 8)
    } else if (s.slice(8, 10) == "AM") {
      s.slice(0, 8)
    } else if (s.slice(8, 10) == "PM" && s.slice(0, 2) == "12") {
      s.slice(0, 8)
    } else {
      12 + s.slice(0, 2).toInt + s.slice(2, 8)
    }
  }

}
