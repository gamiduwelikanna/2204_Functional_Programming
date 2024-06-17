object run{
    def easy(dis1:Double):Double = {
        dis1 * 8
    }

    def Tempo(dis2:Double):Double = {
        dis2 * 7
    }

    def main(args: Array[String]): Unit = {
        val time = easy(2) + Tempo(3) + easy(2)
        println(s"Total time is $time")
    }
}