package org.tritsch.example

import org.scalatest._
import org.scalatest.prop._
import org.scalacheck.Gen

class HelloCheck extends PropSpec with GeneratorDrivenPropertyChecks with Matchers {

  property("Any greeting('name') should return 'hello, name'") {
    forAll(Gen.alphaStr) {name => {
      Hello.greeting(name) shouldEqual ("hello, " + name)
    }}
  }
}
