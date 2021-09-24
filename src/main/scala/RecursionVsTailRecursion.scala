object RecursionVsTailRecursion {

  def factorial(n: Int): Int = {
    if (n <= 1) {
      1
    } else {
      n * factorial(n - 1)
    }
  }

  def factorial1(n: Int): Int = n * factorial1(n - 1)

  @scala.annotation.tailrec
  def tailRecursionFact(n: Int, output: Int = 1): Int = {
    if (n <= 1) {
      output
    } else {
      tailRecursionFact(n - 1, output * n)
    }
  }

  @scala.annotation.tailrec
  def tailRecursionFact1(n: Int, output: Int = 1): Int = tailRecursionFact1(n - 1, output * n)

  def main(args: Array[String]): Unit = {

    println(factorial(5))
//    println(factorial1(5000))

    println(tailRecursionFact(5))
    println(tailRecursionFact1(5000))
  }
}
