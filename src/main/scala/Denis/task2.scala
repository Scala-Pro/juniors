package Denis

object task2 extends App {
  def taskk1(a: Int): Int = {
    a * 10
  }

  def taskk2(a: Int): Int = {
    a + 10
  }

  def taskk3(a: Int): Int = {
    a - 1
  }

  def taskk4(a: String): String = {
    (a.toInt * 10).toString
  }

  def taskk5(a: String): Int = {
    a.toInt * 5
  }

  def taskk6(a: String): Int = {
    a.reverse.toInt
  }

  def taskk7(a: Int, b: Int): (Int, Int) = {
    (a + 2, b + 2)
  }

  def taskk8(a: Int, b: String): Int = {

    b.count(_.toString == a.toString)
  }

  def taskk9(a: String): String = {
    val q = a.toCharArray().toSet.mkString
    val res = for (i <- q.indices) yield {
        s"${q(i)} - ${a.count(_ == q(i))}"
    }
    res.mkString(", ")
  }


}
