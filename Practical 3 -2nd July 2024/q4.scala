object FindSum {

  def findSumOfEvens(arr: Array[Int]): Int = {
    var sum = 0
    for (i <- arr.indices) {
      if (arr(i) % 2 == 0) {
        sum += arr(i)
      }
    }
    sum
  }

  def main(args: Array[String]): Unit = {
    val input = Array(2, 5, 6, 1, 8, 9, 13, 14)
    val sum = findSumOfEvens(input)
    println(s"Sum of even numbers is $sum")
  }
}
