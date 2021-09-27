package oops

trait UniqueTrait {

  def run(args: Array[String]): Unit

  def main(args: Array[String]): Unit = {
    println("Hello")
    println("World")

    run(args)
  }
}
