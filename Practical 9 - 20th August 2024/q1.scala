object InterestCalculator {

    def calculateInterest(deposit: Double): Double = {
        deposit match {
            case d if d <= 20000 => d * 0.02
            case d if d <= 200000 => d * 0.04
            case d if d <= 2000000 => d * 0.035
            case _ => deposit * 0.065
        }
    }

    def main(args: Array[String]): Unit = {
        print("Enter the deposit amount: Rs. ")
        val deposit = scala.io.StdIn.readDouble()
        
        val interest = calculateInterest(deposit)
        println(f"Deposit: Rs. $deposit%.2f, Interest: Rs. $interest%.2f")
    }
}
