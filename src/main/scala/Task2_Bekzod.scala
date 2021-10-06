object Task2_Bekzod {
  def main(args: Array[String]): Unit = {
    // Testing of function compareTriplets
    //      println(compareTriplets(Array(2, 0, 1), Array(77, 16, 8)).mkString(" "))
    staircase(3)

    miniMaxSum(Array(1, 3, 5, 7, 9))


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
    println(arr.sum - arr.max, -arr.min)
  }


}
