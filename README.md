# My default Scala project template

This is an/another **opinionated** template to create a scala project.

Amoung other things it uses/features ...

* ScalaTest, ScalaCheck, ScalaMeter, ...
* scalaFmt
* git integration
* travis integration
* release
* ...

To use this ...

* you install g8 (with `brew install giter8`)
* you run `g8 rolandtritsch/scala.g8`

To develop/test this ...

* you run `sbt g8` or `sbt g8Test` (to generate an instance of the template)
* you then `cd target/g8` and run `sbt run` and `sbt test`
* optionally you can test ...
  * `sbt git`, `sbt git push release`
  * `sbt` ...
