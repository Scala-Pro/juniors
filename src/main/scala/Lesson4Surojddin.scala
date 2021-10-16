object Lesson4Surojddin extends App {
  var list = List(73, 67, 73,  38, 33)

//  // 3ga bo'linadigan qiymatlarni chiqarish
//  for (i <- list; if i % 3 == 0) {
//    println(i)
//  }
//
//  // yig'indisini chiqarish
//  var m = 0
//  for (i <- list) {
//    m += i
//  }
//  println(s"yig'indi: $m")
//
//  // toq indeksdagi raqamlarni chiqarish
//  for ((list, i) <- list.zipWithIndex; if i % 2 != 0) {
//    println(s"list: $list | index: $i")
//  }
//
//  // teskari tartibda chqarish
//  for (i <- list.length - 1 to 0 by -1) {
//    println(list(i))
//  }
//
//
//  def compareTriplets(a: Array[Int], b: Array[Int]): Array[Int] = {
//    // Write your code here
//    var alice = 0
//    var bob = 0
//
//    for (i <- 0 to 2) {
//      if (a(i) > b(i)) alice += 1
//      if (a(i) < b(i)) bob += 1
//    }
//
//    Array(alice, bob)
//
//  }
//
//  def staircase(n: Int) {
//    // Write your code here
//    for (i <- 1 to n) {
//      println(" " * (n - 1) + "n" * n)
//    }
//
//  }

//  def oddElementSum(n: List[Int]): Int = {
//    val elementSum = n.filter(_ % 2 != 0).sum
//    elementSum
//  }

//  def gradingStudents(grades: List[Int]): List[Int] = {
//    grades.map{ el =>
//      if (el % 5 >= 3 && el >= 38) el + (5-(el % 5))
//      else el
//    }
//  }

  def birthdayCakeCandles(candles: List[Int]): Int = {
    // Write your code here
    val maxEl = candles.max
    candles.count(_ == maxEl)


  }

  println(birthdayCakeCandles(list))



}
