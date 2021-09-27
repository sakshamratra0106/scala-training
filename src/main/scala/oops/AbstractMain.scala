package oops

object AbstractMain {

  class DaoImpl1(size: Int) extends Dao {

    val array = new Array[(Int, String)](size)
    var index = 0

    override def insert(id: Int, data: String): Boolean = {
      if (index < size) {
        array(index) = (id, data)
        index += 1
        true
      } else {
        false
      }
    }

    override def printAll(): Unit = {
      for (element <- array) {
        println(element)
      }
    }
  }

  class DaoImpl2 extends Dao {
    override def insert(id: Int, data: String): Boolean = ???

    override def printAll(): Unit = ???
  }


  def main(args: Array[String]): Unit = {

    val dao: Dao = new DaoImpl2

    println(insert(dao)(1, "Scala"))
    println(insert(dao)(2, "Java"))
    println(insert(dao)(3, "Python"))

    dao.printAll()
  }

  def insert(dao: Dao)(id: Int, data: String): Boolean = {

    dao.insert(id, data)
  }
}
