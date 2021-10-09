import scala.io.StdIn.readLine

object WordsProgramSurojiddin extends App {

  case class Word(value: String, definition: String)

  val wordsWithDefinition = List(
    Word("val", "Val bu constanta"),
    Word("var", "Var bu o'zgaruvchi")
  )
  val words = List("val", "var", "map", "/", "%", "for", "foreach", "function", "method", "list", "readLine", "readInt", "readDouble", ":+", "+:", ":::", "::")
  val coders = List("Surojiddin", "Navruz", "Og'abek")
  var knBase = Map.empty[String, List[String]]

  val k = words.length / coders.length

  def insertWord(name: String, word: String): Unit =
    knBase += knBase.get(name).map { words =>
      name -> (word +: words)
    }.getOrElse(name -> List(word))

  for {
    _ <- 0 until k
    name <- coders
  } {
    def selectedWord: String = words(scala.util.Random.nextInt(words.length))

    def recursiveTask(newWord: String): String =
      knBase.get(name).map { coderWords =>
        if (coderWords.contains(newWord)) {
          recursiveTask(selectedWord)
        } else {
          insertWord(name, newWord)
          newWord
        }
      }.getOrElse(newWord)

    println(s"$name - ${recursiveTask(selectedWord)}")

    readLine()
  }

  //  @tailrec
  //  def rec(list: List[Int]): Unit = list match {
  //    case head :: tail =>
  //      println("element" + head.toString)
  //      rec(tail)
  //    case Nil => println("Tugadi")
  //  }
  //
  //  rec(1 :: 2:: 3 :: 4 ::Nil)

  //  println(knBase)

  //  val str = readLine()
  //  val list2 = langs :+ str
  //  println(list2)

  //  val str2 = readLine()
  //  var fruits = List("Apple", "Banana")
  //
  //  if (str2 == fruits.filter(_ == str2).toString){
  //    println("Olma")
  //  } else {
  //    println("Bunday so'z topilmadi")
  //  }

}