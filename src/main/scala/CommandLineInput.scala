
import java.util.Scanner
import scala.io.StdIn

object CommandLineInput {

  def main(args: Array[String]): Unit = {

    val name: String = StdIn.readLine()
    val n: Int = StdIn.readInt()

    println(name)
    println(n)

    val scanner = new Scanner(System.in)
    println(scanner.nextInt())
  }
}
