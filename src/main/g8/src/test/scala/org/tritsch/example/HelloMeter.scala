package org.tritsch.example

import org.scalameter.api._
import org.scalameter.picklers.Implicits._

object HelloMeter extends Bench.OfflineReport {

  import scala.util.Random

  val strGen = for {
    n <- Gen.range("n")(10, 100, 10)
    str = Random.alphanumeric.take(n).mkString
  } yield {
    str
  }

  performance of "Hello" in {
    measure method "greeting" in {
      using(strGen) in {
        name => Hello.greeting(name)
      }
    }
  }
}
