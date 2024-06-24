object Question3 {
  def salary(normal: Double, OThours: Double): Double = {
    normal * 250 + OThours * 85
  }

  def main(args: Array[String]): Unit = {
    val normal = 40
    val OThours = 30
    val gross = salary(normal, OThours) 
    val net = gross - (gross * 0.12) 
    println(net) 
  }
}
