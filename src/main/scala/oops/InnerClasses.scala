package oops

import oops.InnerClasses.person1

object InnerClasses extends App {

  class Person(val name: String) {

    class Male {

      def print = s"$name + M"
    }

    object A

  }

  object A

  val person = new Person("asas")

  println(person)

  println(A)

  val person1 = new Person("sas")

  val male: person1.Male = new person1.Male

  println(male.print)
}
