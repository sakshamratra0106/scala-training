package oops

object Encapsulation extends App {

  class A(private val name: String) {

    private def completeName = name + "--- A"

    override def toString: String = completeName
  }

  class B extends A("Default")

  class X {

    protected def a: Int = 34
  }

  class Y extends X {

    override protected def a: Int = 344

    override def toString: String = a.toString
  }

  val a = new A("Hello")

//  println(a.name)

  val b = new B

  val x = new X

  val x1: X = new Y

//  println(new Y().a)

//  println(x1.a)

//  println(b.name)
}
