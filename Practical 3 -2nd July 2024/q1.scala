object Rev {
    var reversedString = ""

    def reverse(string: String): String = { 
        var length = string.length

        if (length == 0) {
            reversedString
        } else {
            reversedString = reversedString + string.substring(length - 1)
            reverse(string.substring(0, length - 1))
        }
    }

    def main(args: Array[String]): Unit = {
        val input = "Hello World"
        reversedString = "" // Reset the reversedString before using it
        val reversed = reverse(input)

        println(s"Original string: $input")
        println(s"Reversed string: $reversed")
    }
}
