package oops

object AbstractClass extends App {

  trait A {

    def add(a: Int, b: Int): Int

    def print: Unit = println("Unit")
  }

  abstract class B(a1: Int) extends A {

    def  increment(a: Int): Int

    override def add(a: Int, b: Int): Int = {
      println("B")
      a + b
    }

    override def toString: String = s"B($a1)"
  }

  class BImpl extends B(34) {
    override def increment(a: Int): Int = a + 1

    override def add(a: Int, b: Int): Int =  a + b
  }

//  val b = new B

  val b: B = new BImpl

  b.print
}
