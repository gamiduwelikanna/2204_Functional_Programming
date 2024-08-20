import scala.io.StdIn

object NameFormatter {

  val toUpper: String => String = (x: String) => x.toUpperCase
  val toLower: String => String = (x: String) => x.toLowerCase

  val formatNames: (String, String => String) => String = (name, formatFun) => formatFun(name)

  def main(args: Array[String]): Unit = {
    println("Please enter a name:")
    val name = StdIn.readLine()

    println("Choose the formatting option: ")
    println("1. To Uppercase")
    println("2. First two characters Uppercase")
    println("3. To Lowercase")
    println("4. First and last character Uppercase")
    val choice = StdIn.readInt()

    val formattedName = choice match {
      case 1 => formatNames(name, toUpper)
      case 2 => formatNames(name, n => n.substring(0, 2).toUpperCase + n.substring(2))
      case 3 => formatNames(name, toLower)
      case 4 => formatNames(name, n => n.substring(0, 1).toUpperCase + n.substring(1, n.length - 1) + n.substring(n.length - 1).toUpperCase)
      case _ => s"Invalid choice"
    }

    println(s"Formatted name: $formattedName")
  }
}
