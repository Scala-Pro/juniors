import scala.io.StdIn.readInt

object Lesson1 {
  def main(args: Array[String]): Unit = {
    val a = readInt()
    val b = readInt()
    val c = readInt()
    println(s"Area: ${area_triangle(a, b, c)}")
    //    val p = (a + b + c) / 2
    //    val area = Math.sqrt(p * (p - a) * (p - b) * (p -c))
    //    if(area.isNaN) println("Incorrect triangle")
    //    else println(s"Area is $area")
    // input money
    // money > 1000 pizza
    // money > 100 hot-dog
    // money > 10 coffee
    // money < 10 nothing
  }

  def area_triangle(a: Int, b: Int, c: Int) = {
    val p = (a + b + c) / 2
    Math.sqrt(p * (p - a) * (p - b) * (p - c))
  }
}
