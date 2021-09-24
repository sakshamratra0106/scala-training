import scala.util.Random

object DefaultArguments {

  def add(a: Int, b: Int , c: Int = 1) = a + b

  def add1(a: Int, b: Int , c: Int = 1) = {}

  def printZer0(): Unit = println(0)
  def Zero(): Int = 0

  def one = 1
  val two = 2

  def random = new Random().nextInt(23)
  val random1 = new Random().nextInt(23)

  def random2: Int = {
    println("evaluating")
    23
  }

  val random3: Int = {
    println("VAL")
    34
  }

  def main(args: Array[String]): Unit = {

    println(add(2, 2, 2))
    println(add(2, 2))

    println(add(a = 3, b = 34, c = 54))
    println(add(a = 3, c = 54, b = 34))

    println(add(a = 34, b = 67))

    println(Zero())
    println(one)
    println(two)

    println(">>>>>>>>>>")

    println(random1)
    println(random)
    println(">>>>>>>>>>")

    println(random1)
    println(random)
    println("????????")

    println(random2)
    println(random3)
    println(">>>>>>>>>>")
    println(random2)
    println(random3)
  }
}
