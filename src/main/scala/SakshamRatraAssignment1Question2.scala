import scala.io.StdIn

object SakshamRatraAssignment1Question2 {

  def sum(xs: List[String]): Int = {
    if(xs.isEmpty)
      return 0
    else
      return xs.head.toInt + sum(xs.tail)
  }

  def main(args: Array[String]): Unit = {
    println("Please enter File name and List of Numbers")
    val input: String = StdIn.readLine()
//    val input = "Main 1 2 3 4 5"
    val inputData: List[String] = input.split(" ").toList
    val fileName: String =  inputData.head

    //Write a parser to map fileName to Main Function

    val listOfNumbers : List[String]= inputData.tail
    println(s"Filename is ${inputData.head}")
    println(s"List of numbers are : ${listOfNumbers}")

    println(s"Sum of the number is ${sum(listOfNumbers)}")
  }
}
