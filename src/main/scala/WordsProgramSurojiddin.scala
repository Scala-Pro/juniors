import scala.io.StdIn.readLine

object WordsProgramSurojiddin extends App{

  var langs = List("Scala", "Java", "PHP", "JavaScript", "PostgreSQL")
  val coders = List("Surojiddin", "Navruz", "Og'abek")

  for (i <- coders){
    var randomLangs = scala.util.Random.nextInt(langs.length)
    println(s"$i - ${langs(randomLangs)}")
    langs = langs.filterNot(_ == langs(randomLangs))
  }

  val str = readLine()
  val list2 = langs :+ str
  println(list2)

  val str2 = readLine()
  var fruits = List("Apple", "Banana")

  if (str2 == fruits.filter(_ == str2).toString){
    println("Olma")
  } else {
    println("Bunday so'z topilmadi")
  }

}
