package Denis

object Homework_CaseClass extends App {
  case class Notebook(model: String, price: Double, year: Int, cpu: String)

  val notebook1 = Notebook("HP", 1999.90, 2020, "i7")
  val notebook2 = Notebook("Lenovo", 1550.80, 2019, "i5")
  val notebook3 = Notebook("Acer", 1210.35, 2020, "i3")
  val notebook4 = Notebook("Asus", 1440.00, 2019, "i3")
  val notebook5 = Notebook("Dell", 2150.50, 2021, "i5")
  val notebook6 = Notebook("Samsung", 2599.90, 2020, "i7")
  val notebook7 = Notebook("Apple", 3150.80, 2019, "i7")
  val notebook8 = Notebook("Toshiba", 1700.00, 2018, "i3")
  val notebook9 = Notebook("MSI", 1540.00, 2021, "i5")
  val notebook10 = Notebook("Razer", 1950.50, 2021, "i7")

  val allNotebooks = List(notebook1, notebook2, notebook3, notebook4, notebook5, notebook6, notebook7, notebook8, notebook9, notebook10)

  // Group by model
  val grouped = allNotebooks.groupBy(_.model)
  println(s"Grouped by model: $grouped")

  // Max price
  val maxPrice = allNotebooks.maxBy(_.price).model
  println(s"Max price: $maxPrice")

  // Sum of prices
  val sumOfPrices = allNotebooks.map(_.price).sum
  println(s"Sum of prices: $sumOfPrices")

  //Filter by CPU
  val filterByCPU = allNotebooks.filter(_.cpu == "i3")
  println(s"Filtered by CPU: $filterByCPU")
}
