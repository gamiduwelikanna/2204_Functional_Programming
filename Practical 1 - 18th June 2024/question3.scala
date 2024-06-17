object sphere{
    def calSphere(r:Double): Double = {
        math.Pi * r * r * r *(4/3)
    }

    def main(args: Array[String]): Unit = {
        val r =5.0
        val volume = calSphere(r)
        println(s"Volume is $volume")
    }
}