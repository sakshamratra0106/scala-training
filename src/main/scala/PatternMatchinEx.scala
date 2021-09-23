object PatternMatchinEx {

  def main(args: Array[String]): Unit = {


    val age = 54

    val x: String = if (age > 60) "Oldest" else if (age <= 60 && age > 18) "Adult" else "Child"

    val y: String = age match {
      case x if x > 60 => "Oldest"
      case x if x <= 60 && x > 60 => "Adult"
      case x => "child"
    }

    if (23 % 2 == 0) {
      println("Even")
    } else {
      println("Saas")
    }

    println(x, y)
  }
}
