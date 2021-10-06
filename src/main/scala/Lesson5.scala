object Lesson5 {
  def main(args: Array[String]): Unit = {
    // Testing of function compareTriplets
    //      println(compareTriplets(Array(2, 0, 1), Array(77, 16, 8)).mkString(" "))
    //    staircase(3)

    //    miniMaxSum(Array(1, 3, 5, 6, 7))
    // javob 15 21

    println(timeConversion("12:05:39AM"))
    // javob 19:05:45
  }

  def compareTriplets(a: Array[Int], b: Array[Int]): Array[Int] = {
    var alice = 0
    var bob = 0

    for (i <- 0 to 2) {
      if (a(i) > b(i)) alice += 1
      if (a(i) < b(i)) bob += 1
    }
    Array(alice, bob)
  }

  def staircase(n: Int) {
    for (i <- 1 to n) {
      println(" " * (n - i) + "#" * i)
    }

  }

  def miniMaxSum(arr: Array[Int]) {
    val minSum = arr.sum - arr.max
    val maxSum = arr.sum - arr.min
    println(s"$minSum $maxSum")
  }

  def timeConversion(s: String): String = {
    // "07:05:45PM"
    // find error
    if (s.slice(8, 10) == "PM") {
      (12 + s.slice(0, 2).toInt) + s.slice(2, 8)
    } else {
      s.slice(0, 8)
    }

  }

}
