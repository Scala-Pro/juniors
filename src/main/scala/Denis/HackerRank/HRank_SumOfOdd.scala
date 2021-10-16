package Denis.HackerRank

object HRank_SumOfOdd extends App{
  def f(arr:List[Int]):Int = {
    arr.filter(_ % 2 != 0).sum
  }
}
