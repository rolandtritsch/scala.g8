package $package$

import com.typesafe.scalalogging.LazyLogging

/** [[$package$.Hello]] object.
  *
  * Defines the [[main]] function and the [[greeting]] function.
  *
  * @see See [[https://docs.scala-lang.org/overviews/scaladoc/overview.html Scaladoc]] for more information on how to write scala documentation.
  * @note This is by no means complete. It is just to illustrate how this (scala docs) works.
  * @todo Add more documentation, with more tags (for demonstration purposes).
  */
object Hello extends LazyLogging {

  /** The [[greeting]] function.
    *
    * Take the input string (a/the name of a person or a thing) and append it to 'hello, '.
    *
    * @note I know, that it violates DNRY to write documentation like this. The documentation should describe what a function is doing, not how it does it.
    *
    * @param name The name to append
    *
    * @return The full string
    */
  def greeting(name: String): String = {
    require(name.nonEmpty, "name.nonEmpty failed")
    s"\${prefix}, \${name}"
  } ensuring(result => result.nonEmpty && result.size > name.size)

  /** The [[main]] function.
    *
    * Entry point. Just to call [[greeting]].
    */
  def main(args: Array[String]): Unit = {
    require(args.isEmpty, s"args.isEmpty failed; with >\${args.toList}<")
    logger.info("I am about to print something ...")
    println(greeting("world"))
    logger.debug("I printed something!")
  }
}
