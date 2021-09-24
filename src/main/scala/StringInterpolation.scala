object StringInterpolation {

  def main(args: Array[String]): Unit = {

    val fName = "Anil"
    val lName = "Singh"

    val name1: String = fName + " " + lName
    val name2 = fName.concat(" ").concat(lName)
    val name3 = fName.concat(" " + lName)

    println(name1)
    println(name2)
    println(name3)

    /**
     * {
     *    "fName" : "Anil",
     *    "lName" : "Singh"
     * }
     */

    val nam24  = "\"fName\" - " + fName + " " + "\"lName\" - " + lName

    println(nam24)

    val name5 = s"fName-$fName lName-$lName"
    val name6 = s"$fName $lName"

    println(name5)
    println(name6)
    val name7 = s"$fName ${lName.concat("sas")}"
    val name8 = s"$fName $lName.concat(\"sas\")"

    println(name7)
    println(name8)

    val name9 = s"\"fName\" - $fName $lName"

    println(name9)

    val name10 = """"fName""""

    println(name10)

    val name11 = s""""fName"-$fName, "lName"-$lName"""

    println(name11)

    val json =
      s"""{
        |   "fName": "$fName",
        |   "lName": "$lName"
        |}
        |""".stripMargin

    println(json)
  }
}
