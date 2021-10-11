object Test extends App {
  def reverseWithFoldLeft(arr: List[Int]) = {
    arr.foldLeft(List.empty[Int])((newList, el) => el +: newList)
  }

  def sumOddEl(arr: List[Int]): Int = {
    arr.filterNot(_% 2 == 0).sum
  }
}
