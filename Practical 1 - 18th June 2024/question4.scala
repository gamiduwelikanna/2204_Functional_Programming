object cost{
    def calculateDiscount(price:Double): Double = {
        price * .4
    }

    def calculateShipping(copies:Double): Double = copies match{
        case copies if copies>=50 => 50 * 3 + (copies-50)*.75
        case copies if copies<50 => copies * 3
    }

    def main(args: Array[String]): Unit = {
        val copies = 60
        val price = 24.95
        val cost = price * copies - calculateDiscount( price ) * copies + calculateShipping(copies)
        println(s"Total cost is $cost")
    }
}