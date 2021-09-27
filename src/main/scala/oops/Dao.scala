package oops

trait Dao {

  def insert(id: Int, data: String): Boolean

  def printAll(): Unit
}
