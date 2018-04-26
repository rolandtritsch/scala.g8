package org.tritsch.example

/** [[Hello]] object
  */
object Hello extends Greeting with App {
  println(greeting)
}

trait Greeting {
  lazy val greeting: String = "hello, world"
}
