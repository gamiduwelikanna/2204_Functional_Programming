object Average {

  def calculateMean(num1: Double, num2: Double): Double = {
    (num1 + num2) / 2.0
  }
  
  def main(args: Array[String]): Unit = {
    val num1 = 5.0
    val num2 = 10.0
    val mean = calculateMean(num1, num2)

    println(f"The arithmetic mean of $num1 and $num2 is $mean%.2f")
  }
}
