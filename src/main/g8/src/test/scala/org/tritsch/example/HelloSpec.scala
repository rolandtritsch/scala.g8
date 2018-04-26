package org.tritsch.example

import org.scalatest._

class HelloSpec extends FlatSpec with Matchers {
  behavior of "The Hello object"
  it should "say 'hello, world'" in {
    Hello.greeting("world") shouldEqual "hello, world"
  }
}
