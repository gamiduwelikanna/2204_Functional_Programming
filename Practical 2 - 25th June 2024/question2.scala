object question2{
  def main(args: Array[String]): Unit = {
    var a = 2
    var b = 3
    var c = 4
    var d = 5
    var k = 4.3f
    var g = 1.0f 

    b -= 1
    val value1 = b * a + c * d
    d -= 1

    val value2 = a
    a += 1

    val value3 = (-2) * (g - k) + c

    val value4 = c
    c += 1

    c += 1
    val value5 = c * a
    a += 1

    println(value1)
    println(value2)
    println(value3)
    println(value4)
    println(value5)
  }
}
