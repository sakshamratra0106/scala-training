object PatternMatching {

  def main(args: Array[String]): Unit = {

    val marks = 100

    marks match {
      case x if x > 80 => println("A")
      case x if x > 80 => println("A - 1")
      case x if x <= 80 && x > 60 => println("B")
      case x => println("C")
    }

    println(">>>>>>>>>>>>>>>>>>>")

    marks match {
      case x if x > 80 =>
        println("A")
        println("B")
        println("C")
      case x if x > 80 => println("A - 1")
      case x if x <= 80 && x > 60 => println("B")
      case x => println("C")
    }
    println(">>>>>>>>>>>>>>>>>>>")

    marks match {
      case x if x > 80 => {
        println("A")
        println("B")
        println("C")
      }
      case x if x > 80 => println("A - 1")
      case x if x <= 80 && x > 60 => println("B")
      case x => println("C")
    }


    val binary = 0

    binary match {
      case 0 =>
        println("Zero")
      case 1 =>
        println("One")
    }

    val a = 87

    a match {
      case 1 => println("asas")
      case 2 => println("Sas")
      case bb if bb > 45 => println("sdasd")
    }

    val name = "Arun"
    val age = 18

    name match {
      case "Arun" => println("asdasd")
      case "Hello" => println("Sdasd")
      case x if x.contains("Abc") && age > 18 => println("asassaas")
    }

    if (name == "Arun") {
      println("sasas")
    }
  }
}
