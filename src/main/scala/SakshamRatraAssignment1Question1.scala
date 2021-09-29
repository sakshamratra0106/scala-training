import scala.io.StdIn

object SakshamRatraAssignment1Question1 {
  def main(args: Array[String]): Unit = {
    println("Please Enter dimensions of the square matrix : ")
    val nDimensionMatrix: Int = StdIn.readInt()

    //Initializing Both input and Multiplication matrix
    var rawMatrixInputA: Array[Array[String]] = Array.fill(0)(new Array[String](nDimensionMatrix))
    var rawMatrixInputB: Array[Array[String]] = Array.fill(0)(new Array[String](nDimensionMatrix))
    val multiplicatedOutputMatrix: Array[Array[Int]] = Array.ofDim[Int](nDimensionMatrix, nDimensionMatrix)

    //Reading Both Input Matrices
    for(i <- 0 to nDimensionMatrix-1) {
      val Line: String = StdIn.readLine()
      rawMatrixInputA = rawMatrixInputA :+ Line.split(" ")
    }
    for(i <- 0 to nDimensionMatrix-1) {
      val Line: String = StdIn.readLine()
      rawMatrixInputB = rawMatrixInputB :+ Line.split(" ")
    }

    //Add Check if both matrix can be multiplied or not
    def check_multiplication_feasibilty = ???


//    println(rawMatrixInputA.length)
//    println(rawMatrixInputB.length)
//    println(multiplicatedOutputMatrix.length)
//    println(rawMatrixInputA(0)(2))
//    println(rawMatrixInputB(2)(2))

    //Printing Matrix A
    for(arr <- rawMatrixInputA) {
      for (elem <- arr) {
        print(elem + " ")
      }
      println()
    }

    println()

    //Printing Matrix B
    for(arr <- rawMatrixInputB) {
      for (elem <- arr) {
        print(elem + " ")
      }
      println()
    }

//    for(arr <- multiplicatedOutputMatrix) {
//      for (elem <- arr) {
//        print(elem + " ")
//      }
//      println()
//    }


    //Multiplying both the matrices
    var i = 0
    while (i < nDimensionMatrix) {
      var j = 0
      while (j < nDimensionMatrix) {
        var sum = 0
        var k = 0
        while (k < nDimensionMatrix) {
          sum = sum + (rawMatrixInputA(i)(k).toInt * rawMatrixInputB(k)(j).toInt )
          k = k + 1
        }
        multiplicatedOutputMatrix(i)(j) = sum
        j = j + 1
      }
      i = i + 1
    }

    //Printing Multiplication Matrix after multiplication
    for(arr <- multiplicatedOutputMatrix) {
      for (elem <- arr) {
        print(elem + " ")
      }
      println()
    }



  }
}
