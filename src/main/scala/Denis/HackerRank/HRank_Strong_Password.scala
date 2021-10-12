package Denis.HackerRank

import scala.io.StdIn

object HRank_Strong_Password {

  def main(args: Array[String]) = {


    val n = StdIn.readLine.trim.toInt

    val password = StdIn.readLine

    val answer = minimumNumber(n, password)

    println(answer)
  }

  def minimumNumber(n: Int, password: String): Int = {
    // Return the minimum number of characters to make the password strong
    val numbers = "0123456789"
    val lower_case = "abcdefghijklmnopqrstuvwxyz"
    val upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    val special_characters = "!@#$%^&*()-+"

    var numb = false
    var low = false
    var upp = false
    var spec = false

    for (i <- password) {
      if (numbers.contains(i)) numb = true
      else if (lower_case.contains(i)) low = true
      else if (upper_case.contains(i)) upp = true
      else if (special_characters.contains(i)) spec = true
    }

    var res2 = 0
    if (!numb) res2 += 1
    if (!low) res2 += 1
    if (!upp) res2 += 1
    if (!spec) res2 += 1

    Math.max(6 - n, res2)
  }
}
