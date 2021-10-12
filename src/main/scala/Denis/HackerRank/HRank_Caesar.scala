package Denis.HackerRank

import scala.io.StdIn

object HRank_Caesar {
  def main(args: Array[String]) {

    val n = StdIn.readLine.trim.toInt

    val s = StdIn.readLine

    val k = StdIn.readLine.trim.toInt

    val result = caesarCipher(s, k)

    println(result)
  }

  def caesarCipher(s: String, k: Int): String = {
    // Write your code here
    s.map(el => if (el != '-' && el.isLetter) {
      val x = (el.toInt + k).toChar
      if (el.isLower && x > 'z') (x.toInt - 26 - k).toChar
      else x
    } else el)
  }

}
