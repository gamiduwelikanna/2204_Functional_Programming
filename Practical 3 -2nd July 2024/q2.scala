object StringFilter {

  def filterLongStrings(strings: List[String]): List[String] = {
    strings.filter(s => s.length > 5)
  }

  def main(args: Array[String]): Unit = {
    val inputStrings = List("Hi", "World", "Code", "Programming", "SCS2204")
    val longStrings = filterLongStrings(inputStrings)

    println(s"Original list: $inputStrings")
    println(s"Filtered list (length > 5): $longStrings")
  }
}
