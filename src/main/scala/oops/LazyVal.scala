package oops

object LazyVal extends App {

  class A {

    val a: Int = {
      println("Val")
      34
    }

    val a1: Int = {
      println("Val1")
      34
    }

    lazy val a2: Int = {
      println("Lazy")
      344
    }

    def a3: Int = {
      println("Def")
      222
    }
  }

  val a = new A

  println(">>>>>>>>")

  println(a.a)
  println(a.a1)
  println(">>>>>>>>")
  println(a.a)
  println(a.a1)
  println(">>>>>>>>")
  println(a.a2)
  println(a.a3)
  println(">>>>>>>>")
  println(a.a2)
  println(a.a3)
}
