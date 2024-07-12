import scala.io.StdIn.readLine;

object patternMatching{
  def matchPattern(x:Int):Unit = x match{
    case 0 => println("Zero");
    case n if n<0 => println("Negative");
    case n if n%2==0 => println("Even");
    case _ => println("Odd");
  }

  def main(args: Array[String]):Unit = {
    print("Enter a number: ");
    val input = readLine();
    val num =  input.toInt;

    matchPattern(num);
    
  }  
}

