import sbt._

object Dependencies {
  lazy val scalaTest = "org.scalatest" %% "scalatest" % "3.0.5"
  lazy val scalaCheck = "org.scalacheck" %% "scalacheck" % "1.14.0"
  lazy val scalaMeter = "com.storm-enroute" %% "scalameter" % "0.9"
  lazy val scalaLogging = "com.typesafe.scala-logging" %% "scala-logging" % "3.9.0"
  lazy val logbackClassic = "ch.qos.logback" % "logback-classic" % "1.2.3"
}
