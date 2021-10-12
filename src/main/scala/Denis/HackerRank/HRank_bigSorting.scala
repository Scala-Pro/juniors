package Denis.HackerRank

import scala.io.StdIn

object HRank_bigSorting{

  def main(args: Array[String]) {
    val s = StdIn.readLine

    val result = pangrams(s)

    println(result)
  }
//  def pangrams(s: String): String = {
//    // Write your code here
//    val abc = "abcdefghijklmnopqrstuvwxyz"
//    val input = s.toLowerCase().toSet.mkString.sorted.trim
//    if (abc == input) "pangram"
//    else "not pangram"
//  }

  def pangrams(s: String): String = {
    // Write your code here
    if(s.toLowerCase().toSet.size == 27) "pangram"
    else "not pangram"
  }
}
