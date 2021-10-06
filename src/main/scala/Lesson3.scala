object Lesson3 extends App {

  case class Student(name: String, age: Int, direction: List[String])

  case class Teacher(name: String = "Temur", age: Int, direction: List[String], tel: String)

  val akaml = Teacher(name = "Akmal", age = 34, direction = List("Web App"), tel = "+9999999")
  println(akaml)

  val tohir = Student("Tohir", 22, List("Frontend"))
  val akbar = Student("Akbar", 23, List("Backend"))
  val shuxrat = Student("Shuxrat", 22, List("Frontend"))
  val kamol = Student("Kamol", 22, List("Frontend"))
  val doniyor = Student("Doniyor", 22, List("Frontend"))

  val studentDirection = akbar match {
    case Student(_, _, List("Backend")) =>
      "Backend"
    case Student("Akbar", _, _) =>
      "Akbar"
    case _ =>
      "Topilmadi "
  }

  println(s"studentDirection: $studentDirection")

  val studentName = akbar match {
    case Student("Tohir", _, _) =>
      "Tohir"
    case Student("Akbar", _, _) =>
      "Akbar"
    case _ =>
      "Topilmadi "
  }

  println(s"studentName: $studentName")

  val doniyorTuple: (String, Int, List[String]) = (doniyor.name, doniyor.age, doniyor.direction)
  val doniyorTupleAge = doniyorTuple._2
  println(s"doniyorTuple: $doniyorTuple")
  println(s"doniyorTupleAge: $doniyorTupleAge")

  val doniyorAge = doniyor.age
  val doniyorName = doniyor.name
  println(s"Doniyor Age: $doniyorAge")
  println(s"Doniyor Name: $doniyorName")

  val allStudent = List(shuxrat, akbar, tohir, kamol, doniyor)

  val diffStudent = if (tohir == akbar) {
    "Student teng"
  } else {
    "teng emas"
  }

  val nameStudent = allStudent.groupBy(_.name)

  println(s"nameStudent: $nameStudent")
  //  println(s"diffStudent: $diffStudent")
  //  println(s"allStudent: $allStudent")

  val t: ((String, Int, List[String])) => Student = (Student.apply _).tupled

  // ===== Home Work Start =====
  case class Notebook(model: String, price: Int, year: Int, cpu: String)

  val acer1 = Notebook("Acer", 4000000, 2020, "i5")
  val acer2 = Notebook("Acer", 6000000, 2018, "i3")
  val hp = Notebook("Hp", 7000000, 2021, "i7")
  val lenovo = Notebook("Lenovo", 8000000, 2019, "i7")
  val dell = Notebook("Dell", 12000000, 2021, "i9")

  val allNotebook = List(acer1, acer2, hp, lenovo, dell)

  val res1 = allNotebook.groupBy(_.model).values
  val res2 = allNotebook.maxBy(_.price).model
  val res3 = allNotebook.map(_.price).sum
  val res4 = allNotebook.filter(_.cpu == "i7")

  println(s"Result 1: $res1")
  println(s"Result 2: $res2")
  println(s"Result 3: $res3")
  println(s"Result 4: $res4")

  // ===== End =====

}
