package Denis.HackerRank

import com.sun.net.httpserver.Authenticator.Result

import java.io.PrintWriter
import scala.io.StdIn

object HRank_Time_conversion {
  def main(args: Array[String]) {
    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val s = StdIn.readLine

    val result = timeConversion(s)

    printWriter.println(result)

    printWriter.close()
  }

  def timeConversion(s: String): String = {
    // Write your code here 07:05:45PM
    if (s.slice(8, 10) == "PM") {
      12 + s.slice(0, 2).toInt + s.slice(2, 8)
    } else {
      s.slice(0, 8)
    }
  }
}
