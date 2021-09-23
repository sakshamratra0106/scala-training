object IfElseExample {

  def main(args: Array[String]): Unit = {

    val marks = 84

    // && And
    // || Or
    // !

    if (marks > 80) {
      println("A")
    } else if (marks <= 80 && marks > 60) {
      println("B")
    } else if (marks <= 60 && marks > 40) {
      println("C")
    } else {
      println("D")
    }

    if (marks > 80)
      println("A")
    else if (marks <= 80 && marks > 60)
      println("B")
    else if (marks <= 60 && marks > 40)
      println("C")
    else
      println("D")

    if (marks > 80)
      println("A")
    else if (marks <= 80 && marks > 60)
      println("B")
    else if (marks <= 60 && marks > 40)
      println("C")
    else
      println("D")
      println("E")
  }
}
