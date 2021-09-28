package oops

object NewMain extends App {

  val addClass = new AddClass
  val addClass1 = new AddClass

  println(addClass.add(1 , 2))
  println(addClass.add(2, 3))

  println(Adder.add(1 , 2))

  trait A {

    def name: String
  }

  object B extends A {
    override def name: String = "B"
  }

  val a: A = B
  val a1: A = B

  println(a.name)

  println(B.name)

  println(ScalaJava.newInstance)

  val person: InnerClasses.Person = new InnerClasses.Person("asas")


}
