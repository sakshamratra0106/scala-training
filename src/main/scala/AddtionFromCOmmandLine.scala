object AddtionFromCOmmandLine {

  def main(args: Array[String]): Unit = {

    var sum = 0
    for (arg <- args) {
      sum = sum + arg.toInt
    }

    println(sum)
  }
}
