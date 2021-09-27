package oops

object Overriding {

  class A {

    def printA: Unit = println("A")
  }

  class B extends A {

    def printB: Unit = println("B")

    override def printA: Unit = println("From B to A")
  }

  def main(args: Array[String]): Unit = {

    val a: A = new A

    a.printA

    val b: B = new B

    b.printA
    b.printB

    val a1: A = new B // Upcasting

    a1.printA
//    a1.printB

    val b1: B = a1.asInstanceOf[B]

//    val b2 = (new A).asInstanceOf[B]

    if (a1.isInstanceOf[B]) {
      val b2 = a1.asInstanceOf[B] // downcasting
    }

    println(b1.printB)
  }
}
