import scala.io.StdIn

object SakshamRatraAssignment1Question3 {

  def superDigit(digit: Int) : Int = {
    var sum: Int = 0
    if(digit.toString.length() == 1) {
      return digit
    }
    else {
      val digitArray: String = digit.toString()
      for(d <- digitArray) {
        sum +=d.toString.toInt
      }
    }
    superDigit(sum)
  }

  def main(args: Array[String]): Unit = {
    println("Please enter the super digit below")
    val digit: Int = StdIn.readInt()
    println(s"Recursive Digit Sum of digit ${digit} is ${superDigit(digit)}")
  }
}
