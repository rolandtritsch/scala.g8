package $package$

import org.scalatest._
import org.scalatest.prop._
import org.scalacheck.Gen

class HelloCheck extends PropSpec with GeneratorDrivenPropertyChecks with Matchers {

  // disable shrinking (to make debugging easier)
  import org.scalacheck.Shrink
  implicit def noShrink[T]: Shrink[T] = Shrink.shrinkAny

  property("Any greeting('name') should return 'hello, name'") {
    forAll(Gen.alphaStr) {name => {
      if(name.isEmpty) {
        an [IllegalArgumentException] should be thrownBy Hello.greeting(name)
      } else {
        Hello.greeting(name) shouldEqual s"\${prefix}, \${name}"
      }
    }}
  }
}
