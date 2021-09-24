object ArrayInScala {

  def main(args: Array[String]): Unit = {

    val array: Array[Int] = new Array[Int](2)
    val array1: Array[Int] = new Array(2)
    val array2 = new Array[Int](2)

    val array3: Array[Int] = Array(1,2)

    val array4 = Array.fill(4)(4)

    val array2D: Array[Array[Int]] = Array.ofDim[Int](2,3)
    val array2D1: Array[Array[Int]] = Array.fill(3)(new Array[Int](3))
    val array2D2: Array[Array[Int]] = Array(Array(1, 2), Array(2, 3))
    val array2D3: Array[Array[Int]] = new Array[Array[Int]](4)

    var s = 0
    while (s < array2D3.length) {
      array2D3(s) = new Array[Int](4)
      s += 1
    }


    println(array(0))
    println(array(1))

    array(0) = 65

    println(array(0))

    println(array3(0))
    println(array3(1))
//    println(array3(2))

    println(array3.length)

    println(array4(0), array4(1), array4(2), array4(3))

    for(i <- array3){
      println(i)
    }

    var i = 0
    while(i < array3.length) {
      println(array3(i))
      i += 1
    }


    for(arr <- array2D) {
      for (elem <- arr) {
        print(elem + " ")
      }
      println()
    }

    var j = 0
    var k = 0

    while(j <= 2) {
      while(k <= 3) {
        print(array2D(j)(k))
        k += 1
      }
      j +=1
      println()
    }
  }
}
