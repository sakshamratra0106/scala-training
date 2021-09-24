object Looping {

  def main(args: Array[String]): Unit = {

    var i = 0

    while(i <= 4) {
      println(i)
      i += 1
    }

    i = 0

    do {
      println("i")
      i += 1
    } while(i <= -1)
    println(">>>>>>>>")
    for (j <- 0 to 4) {
      println(j)
    }

    for (j <- 0 until 4) {
      println(j)
    }
    println(">>>>>>")
    for (j <- 0 to 2) {
      for (k <- 0 to 2) {
        println(j, k)
      }
    }
    println(">>>>>>")

    for (i <- 0 to 4 by 2) {
      println(i)
    }

    println(">>>>")

    val range: Range = 0 to 4 by 2

    for (j <- range) {
      println(j)
    }
  }

  // If else
  // Pattern matching
  // while, do while, for
}
