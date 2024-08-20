import scala.io.StdIn

object NumberClassifier {

  val pattern: Int => String = {
    case i if i <= 0 => s"$i is Negative/Zero"
    case i if i % 2 == 0 => s"$i is Even"
    case i if i % 2 != 0 => s"$i is Odd"
  }

  def main(args: Array[String]): Unit = {
    println("Please enter an integer:")

    val input = StdIn.readLine()

    try {
      val number = input.toInt
      println(pattern(number))
    } catch {
      case _: NumberFormatException => println("Invalid input. Please enter a valid integer.")
    }
  }
}
