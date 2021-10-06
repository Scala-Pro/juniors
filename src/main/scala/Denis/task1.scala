package Denis

import scala.io.StdIn.{readInt, readLine}

object task1 extends App{

//  def multiple(a: Int, b: Int) = {
//    val text = "TEXT"
//    val x = a * b
//    (x, text)
//  }
//
//  println(multiple(4, 6))

  def strongPass(password: String) = {
    val digits = password.count(_.isDigit)
    val uppers = password.count(_.isUpper)
    val lowers = password.count(_.isLower)
    val symbols = password.count(el => !el.isDigit && !el.isLetter)
    val length = password.length
    s"Digits: $digits\nUppers: $uppers\nLowers: $lowers\nSymbols: $symbols\nLength: $length"

  }

  println(strongPass("asdQWERTY1234!@#$%"))

}