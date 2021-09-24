object CommandLineArgument {

  def main(args: Array[String]): Unit = {

//    println(s"Hello ${args(0)}")

    val str: String = "1"
    val in: Int = str.toInt
    val doub = "23.3".toDouble
    val boo = "true".toBoolean

    println(in, doub, boo)

    println("11sss".toInt)
  }
}
