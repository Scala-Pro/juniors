package Denis

object CaseClassTask extends App {
  case class Car(model: String, color: String, mileage: Int)

  val car1 = Car("Mercedes", "Red", 15000)
  val car2 = Car("BMW", "Black", 12345)
  val car3 = Car("Lexus", "White", 21320)
  val car4 = Car("Subaru", "Blue", 32146)
  val car5 = Car("Kia", "Gray", 24431)
  val car6 = Car("Ford", "Cyan", 16840)
  val car7 = car1.copy(model = "Ferrari",mileage = 40000)

  val allCars = List(car1, car2, car3, car4, car5, car6, car7)
  val maxMileage = allCars.sortBy(_.mileage)

  println(s"Model: ${maxMileage.last.model}")

}
