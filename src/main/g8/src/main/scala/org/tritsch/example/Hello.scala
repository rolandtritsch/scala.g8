package $package$

/** [[Hello]] object
  */
object Hello {
  def greeting(name: String): String = {
    "hello, " + name
  }

  def main(args: Array[String]): Unit = {
    println(greeting("world"))
  }
}
