import scala.io.StdIn.readLine

object WordsProgramSurojiddin extends App {

  case class Word(value: String, definition: String)

  val wordsWithDefinition = List(
    Word("val", "Val bu constanta"),
    Word("var", "Var bu o'zgaruvchi"),
    Word("map", "map bu ................"),
    Word("/", "/ bu bo'lish operatiri"),
    Word("%", "% qoldiqni topish operatori"),
    Word("for", "for bu sikl aylantirish operatori"),
    Word("foreach", "foreach bu sikl aylantirish operatori"),
    Word("function", "function bu def"),
    Word("method", "method bu method"),
    Word("list", "list bu bir xil tipdagi elementlar ro'yxati"),
    Word("readLine", "readLine bu bir qator so'z kiritish"),
    Word("readInt", "readInt bu intejer son kiritish"),
    Word("readDouble", "readDouble bu intejer son kiritish"),
    Word(":+", ":+ bu listga elementni oxirdan qo'shish"),
    Word("+:", "Var bu o'zgaruvchi"),
    Word(":::", "Var bu o'zgaruvchi"),
    Word("::", "Var bu o'zgaruvchi"),
  )

  println(wordsWithDefinition)

  val words = List("val", "var", "map", "/", "%", "for", "foreach", "function", "method", "list", "readLine", "readInt", "readDouble", ":+", "+:", ":::", "::")
  val coders = List("Surojiddin", "Navruz", "Og'abek")
  var knBase = Map.empty[String, List[Word]]

  val k = wordsWithDefinition.length / coders.length

  def insertWord(name: String, word: Word): Word = {
    knBase += knBase.get(name).map { words =>
      name -> (word +: words)
    }.getOrElse(name -> List(word))
    word
  }

  for {
    _ <- 0 until k
    name <- coders
  } {
    def selectedWord: Word = wordsWithDefinition(scala.util.Random.nextInt(wordsWithDefinition.length))

    def recursiveTask(newWord: Word): Word =
      knBase.get(name).map { coderWords =>
        if (coderWords.contains(newWord)) {
          recursiveTask(selectedWord)
        } else {
          insertWord(name, newWord)
        }
      }.getOrElse(newWord)

    val lastWord = recursiveTask(selectedWord)

    println(s"$name - ${lastWord.value}")

    if (readLine() == "d"){
      println(lastWord.definition)
    }

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