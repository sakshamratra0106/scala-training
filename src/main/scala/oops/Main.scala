package oops

object Main {

  def main(args: Array[String]): Unit = {

    val person = new Person("Arun", "Singh", "+911234567890")

    val person1 = new Person("Arun", "1234567890")

    val person2 = new Person("Arun")

    val person3 = new Person()

    println(person.fName)
    println(person.fName)
    println(person.mobile)
    println(person.fullName)

    println(person1.fullName)

    println(person2.mobile)

    println("????" + person.hashCode())

    println(person.toString)

    println(person.hashCode().toHexString)

    println(person1.toString)

    println(person)

    val malePerson: MalePerson = new MalePerson("Vinod", "Singh")

    println(malePerson.fullName)
    println(malePerson.gender)

    val person4: Person = malePerson

    val a: Int = 23

    println(a + 1)

    println(a.+(1))

    val b: String = "hello"

    println(b.charAt(0))

//    println(person4.gender)
    println(malePerson.gender)
  }
}
