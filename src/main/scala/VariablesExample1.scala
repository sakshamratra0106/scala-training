object VariablesExample1 {

  def main(args: Array[String]): Unit = {

    var variable: Int = 23 // mutable variables
    println(variable)

    variable = 54
    println(variable)

//    variable = "Hello"

    val variable1 = 45 // immutable variable

    println(variable1)

    var variable2 = 233

    println(variable2)

    variable2 = 1 + variable2

//    variable2 = "asasas"

//    int a = 34

    val integer: Int = 23
    val double: Double = 23.3
    val float: Float = 34.4F
    val long: Long = 34L
    val byte: Byte = 34
    val short: Short = 34
    val boolean: Boolean = true
    val boolean1: Boolean =  false
    val boolean2: Boolean = 34 > 56
    val char: Char = 'A'
    val int1: Int = char

    val string: String = "Hello"
  }
}
