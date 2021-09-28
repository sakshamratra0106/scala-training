package oops

object AsbtractionExample extends App {

  trait A {

    val name: String

    def name1: String

    def name2: String
  }

  class B extends A {
    override val name: String = {
      println("Val")
      "Hello"
    }

    override def name1: String = {
      println("Def")
      "Hello1"
    }

    override val name2: String = {
      println("Val Overided")
      "hello2"
    }
  }

  val b: A = new B

  println(b.name)
  println(b.name)
  println(b.name)
  println(b.name)
  println(b.name)

  println(b.name1)
  println(b.name1)
  println(b.name1)

  println(b.name2)
  println(b.name2)
  println(b.name2)
  println(b.name2)
}
