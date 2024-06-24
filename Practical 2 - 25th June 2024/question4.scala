object MovieTheaterProfit {
  def attendance(price: Double): Double = {
    120 + ((15.0 - price) / 5.0 * 20)
  }

  def totalCost(attendance: Double): Double = {
    500 + attendance * 3
  }

  def totalRevenue(price: Double, attendance: Double): Double = {
    price * attendance
  }

  def profit(price: Double): Double = {
    val att = attendance(price)
    totalRevenue(price, att) - totalCost(att)
  }

  def main(args: Array[String]): Unit = {
    val price = 10.0
    val profits = profit(price)

    println(s"The profit is Rs $profits")
  }
}
