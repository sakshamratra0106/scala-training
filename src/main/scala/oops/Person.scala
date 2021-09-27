package oops

class Person (val fName: String, val lName: String, val mobile: String) {

  def this(fName: String, mobile: String) {
    this(fName, "Default", mobile)
  }

  def this(fName: String) {
    this(fName, "2345678910")
  }

  def this() {
    this("Fname", "Lname", "122333")
  }

  def fullName: String = s"$fName $lName"

  override def toString: String = s"Person($fName,$lName,$mobile)"

  override def hashCode(): Int = {

    val charArray: Array[Char] = fName.toCharArray
    var sum = 0

    for (i <- charArray) {
      sum += i
    }

    sum
  }
}
