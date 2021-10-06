object Lesson4 extends App {
  //  def exampleWhile1(): Unit =
  //    while (true) {
  //      println("Hello world!")
  //    }

  def exampleWhile2(): Unit = {
    var i = 0
    while (i < 0) {
      println(s"current i: $i")
      i += 1
    }
  }

  //  def exampleWhile3(): Unit = {
  //    var i = 20
  //    while (i > 10 && i <= 20) {
  //      println(s"current i: $i")
  //      i -= 1
  //    }
  //  }
  //
  //  def exampleDoWhile1: Any = {
  //    var i = 0
  //    do {
  //      println(s"current i: $i")
  //      i += 1
  //    } while (i < 0)
  //  }
  //
  //  def exampleFor(): Unit =
  //    for (i <- 0 to 10) {
  //      println(s"current i: $i")
  //    }
  //
  //  def exampleFor2(): Unit =
  //    for (i <- 10 until 1 by -1) {
  //      println(s"current i: $i")
  //    }
  //
  //  def exampleFor3(): Unit =
  //    for (i <- List(1, 2, 3, 4, 5, 6, 6, 8,  9, 10)) {
  //      println(s"current i: $i")
  //    }
  //
  //  def exampleFor4(): Unit =
  //    for {
  //      i <- List(1, 2, 3, 4, 5, 6, 6, 8,  9, 10)
  //      if i % 2 == 0
  //    } println(s"even i: $i")
  //
  //  def exampleFor5(): Unit =
  //    for {
  //      i <- 0 until 10
  //      if i % 2 == 1
  //    } println(s"odd i: $i")
  //
  //  def exampleFor6(): Unit =
  //    for {
  //      i <- 0 until 10
  //      if i > 3
  //      if i < 7
  //    } println(s"current i: $i")
  //
  //  def exampleFor7(): Unit =
  //    for {
  //      i <- 0 until 10
  //      if i > 3 && i < 7
  //    } println(s"current i: $i")
  //
  //  def exampleFor8(): Unit =
  //    for {
  //      i <- 0 until 10
  //      j <- 0 until 10
  //    } {
  //      print(s"current i: $i | ")
  //      println(s"current j: $j")
  //    }
  //
  //  def exampleFor9(): Unit =
  //    for(i <- 0 until 10 ) {
  //      for (j <- 0 until i) {
  //        print(s"current i: $i | ")
  //        println(s"current j: $j")
  //      }
  //    }
  //
  //  def exampleFor10(): Unit =
  //    for(i <- 0 until 10 ) {
  //      for (j <- 0 until i) {
  //        print(s"current i: $i | ")
  //        println(s"current j: $j")
  //      }
  //    }
  //
  //  def exampleFor11(): Unit =
  //    for((i, j) <- (0 until 16) zip (0 until 15)) {
  //      print(s"current i: $i | ")
  //      println(s"current j: $j")
  //    }
  //
  //  def exampleFor12(): Unit =
  //    for((n, i) <- (5 until 16).zipWithIndex) {
  //      println(s"number: $n | index: $i")
  //    }
  //
  //  def exampleFor13(): Unit = {
  //    val numbers = for {
  //      (n, i) <- (5 until 16).zipWithIndex
  //      if n % 2 == 0
  //    } yield {
  //      println(s"number: $n | index: $i")
  //      n
  //    }
  //
  //    println(numbers)
  //  }
  //
  //  def exampleForeach(): Unit = {
  //    //(0 to 10).foreach(println)
  //    //(0 to 10).foreach(n => println(n))
  ////    (0 to 10).foreach(println(_))
  //    val result: Unit = (0 to 10).foreach(n => n + 1)
  //    println(result)
  //  }
  //
  //  def exampleMap(): Unit = {
  //    val result = (0 to 10).map(println)
  //    //(0 to 10).map(n => println(n))
  //    //(0 to 10).map(println(_))
  ////    val result = (0 to 10).map(n => n * 2)
  //    println(result)
  //  }
  //
  // def exampleTask2(): Unit = {
  //   val list = List(5, 7, 15, 50, 55, 21, 37)
  //   for {
  //      (el, index) <- list.zipWithIndex
  //      if index < list.length - 1 && (el + list(index + 1)) % 2 == 0
  //    } {
  //      println(s"i1 = $el | i1 = ${list(index + 1)}")
  //    }
  // }
  //
  //  exampleTask2()


}
