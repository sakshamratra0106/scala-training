package oops

object Polymorphism extends App {

  def add(a: Int, b: Int = 1): Int = a+ b
//  def add(a: Char, b: Char = 1): Char = (a+ b).asInstanceOf[Char]

  def add(a: String, b: String): String = a + b


  add(1,2)
  add(1, 2)
  add("Hello ", "scala")

  class A {

    override def toString: String = "A"
  }

  class B extends A {

    override def toString: String = ???
  }

  val a: A = new A

  println(a)

  val a1 : A = new B

  println(a1)
}
