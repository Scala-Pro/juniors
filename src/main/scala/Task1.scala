object Task1 {
  def main(args: Array[String]): Unit = {
    //    var money = readInt()

    //    val food2 = if(money > 1000) "Pizza"
    //    else if(money > 100) "Hot dog"
    //    else if(money > 10) "coffee"
    //    else "nothing"

    //    val food = money match {
    //      case 1000 => "Pizza"
    //      case 100 => "Hot dog"
    //      case 15 => "coffee"
    //      case _ => "nothing"
    //    }

    //    println(s"You can buy $food")

    val fruit = Array("Apple", "banana", "orange")

    println(s"Fruit string length: ${fruit(1).length}")
    println(s"Fruit func to upperCase: ${fruit(1).toUpperCase}")
    println(s"Fruit list: ${fruit.mkString(", ")}")

    val text = "    Today is hot day.        "
    println(text.trim.split(' ')(0))
  }
}
