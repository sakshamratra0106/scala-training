object TupleExampl {

  def myMethod(name: String): (Int, Char) = (name.length, name.charAt(0))

  def main(args: Array[String]): Unit = {

    val tupe: (Int, Double, String, Boolean) = (23, 23.3, "hello", true)

    val firstElement: Int = tupe._1
    val second: Double = tupe._2
    val third: String = tupe._3
    val fourth: Boolean = tupe._4

    val a: (Int, Char) = myMethod("Hello")

    println(a._1)
    println(a._2)

    val (length, chary) = myMethod("sas")

    println(length)
    println(chary)

    val (a1: Int, b: Double, c: String) = (1, 23.3, "Hello")

    println(a1)
    println(b)
    println(c)

//    val b1 = (1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1)

    val b2: ((Int, String), (Int, Boolean)) = ((1, "hello"), (2, true))

    val ((x1: Int, x2: String), (x3: Int, x4: Boolean)) = b2

    val b3: (Int, Double) = 1 -> 34.4

    val b4: ((Int, Int), Int) = 1 -> 2 -> 3
    val b5: (((Int, Double), Boolean), Char) = 1 -> 23.3 -> true -> 'A'

    b5 match {
      case x =>
        println(x._1._1._1)
    }

    b5 match {
      case (((x1: Int, x2: Double), x3: Boolean), x4: Char) =>
    }
  }
}
