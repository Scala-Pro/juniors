package Denis.HackerRank

import scala.collection.mutable.ListBuffer
import scala.io.StdIn.readLine
import scala.util.Random

object task3 extends App {
  def randomWords(): Unit = {
    var names = List("Alisher", "Denis", "Ogabek", "Siroj", "Navruz")
    var words = List("Car", "Phone", "Sun", "Table", "Desk")

    for (i <- names) {
      val rand = names(scala.util.Random.nextInt(names.length))
      val rand2 = words(scala.util.Random.nextInt(words.length))

      println(s"$rand: $rand2")
      names = names.filterNot(_ == rand)
      words = words.filterNot(_ == rand)
    }
  }



  def newWord(): Unit = {
    val name = readLine("Enter your name: ")
    val words = List("Car", "Phone", "Sun", "Table", "Desk")
    val word = words(scala.util.Random.nextInt(words.length))

    println(s"New word for $name: $word")
  }

  def showNewWord(): String = {
    val word = readLine
    val words = ListBuffer("Car", "Phone", "Sun", "Table", "Desk")
    words += word
    words.mkString(", ")
  }

//  def dictionary()= {
//    val word = readLine("Enter the word: ")
//    val words = Map("Car" -> "Moshina", "Phone" -> "Telefon", "Sun" -> "Quyosh", "Table" -> "Stol", "Desk" -> "Parta")
//    for (i <- words.keys) {
//      if (words(word) == words(i)) {
//        println(words(word))
//      } else {
//
//      }
//    }
//  }


}
