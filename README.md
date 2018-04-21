# My default Scala project template

This is an/another **opinionated** template to create a scala project.

Amoung other things it uses/features ...

* ScalaDoc
* ScalaTest, ScalaCheck, ScalaMeter, ...
* scalaFmt
* git integration
* travis integration
* release
* require/ensure
* ...

To use this ...

* you install g8 (with `brew install giter8`)
* you run `g8 rolandtritsch/scala.g8`

To develop/test this ...

* you fork the repo
* you make the changes you want to make
* you run `sbt g8` or `sbt g8Test` (to generate an instance of the template)
* you then `cd target/g8` and run `sbt run` and `sbt test`
* optionally you can test ...
  * `sbt git`, `sbt git push release`
  * `sbt doc` ...
* you can then ...
  * ... either ...
    * `sbt add .`
    * `sbt commit -m "..."`
    * `sbt push` (this will trigger a travis build, if you have travis configured/enabled on your forked repo)
  * ... or ...
    * `sbt add .`
    * `sbt "release with-defaults"`
