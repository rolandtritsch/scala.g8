package org.tritsch.example

import org.scalatest._

class HelloSpec extends FlatSpec with Matchers {
  "The Hello object" should "say 'hello, world'" in {
    Hello.greeting shouldEqual "hello, world"
  }
}
