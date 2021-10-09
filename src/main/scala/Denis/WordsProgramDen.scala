package Denis

import scala.io.StdIn.readLine

object WordsProgramDen extends App {
  case class Word(value: String, definition: String)

  val wordsWithDefinition = List(
    Word("val", "Val bu constanta"),
    Word("var", "Var bu o'zgaruvchi"),
    Word("map", "map bu sikl"),
    Word("/", "/ bu bo'lish"),
    Word("%", "% bu qoldiqli bo'lish"),
    Word("for", "for bu sikl"),
    Word("foreach", "foreach bu sikl"),
    Word("function", "function bu qandaydir operatsiya bajaradigan bo;lim"),
    Word("method", "method bu funksiya bilan turdosh"),
    Word("list", "list bu ro'yxat"),
    Word("readLine", "readLine kiritiladigan satr"),
    Word("readInt", "readInt kiritiladigan butun son"),
    Word("readDouble", "readDouble kiritiladigan haqiqiy son"),
    Word("+:", "+: list oxiriga element qo'shish"),
    Word(":+", ":+ list boshiga element qo'shish"),
    Word(":::", "::: lisga list qo'shish"),
    Word("::", ":: lisga element qo'shish")
  )
  val words = List("val", "var", "map", "/", "%", "for", "foreach", "function", "method", "list", "readLine", "readInt", "readDouble", ":+", "+:", ":::", "::")
  val coders = List("Surojiddin", "Navruz", "Og'abek")
  var knBase = Map.empty[String, List[String]]

  val k = words.length / coders.length

  def insertWord(name: String, word: String):String = {
    knBase += knBase.get(name).map { words =>
      name -> (word +: words)
    }.getOrElse(name -> List(word))
    word
  }

  for {
    _ <- 0 until k
    name <- coders
  } {
    def selectedWord: String = words(scala.util.Random.nextInt(words.length))

    def recursiveTask(newWord: String): String =
      knBase.get(name).map { coderWords =>
        if (coderWords.contains(newWord)) {
          println(s"$newWord word already exis in coder: $name")
          recursiveTask(selectedWord)
        } else {
          insertWord(name, newWord)
          newWord
        }
      }.getOrElse(insertWord(name, newWord))

    println(s"$name - ${recursiveTask(selectedWord)}")

    val input = readLine()

    if (input == "d") {
      println(wordsWithDefinition.map{el =>
        if (el.value == recursiveTask((selectedWord))) {
          println(el.definition)
        }
      })
    }

  }

println(knBase)

}
