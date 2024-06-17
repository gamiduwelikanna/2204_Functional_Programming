object calcuateTemp{
    def convert(celcius:Double):Double = {
        celcius*1.8 + 32
    }

    def main(args: Array[String]): Unit = {
        val temp = 35.0
        val calculate = convert(temp)
        println(s"The temperature in Fahrenheit is $calculate")
    }
}