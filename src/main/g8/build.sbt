import Dependencies._

lazy val root = (project in file("."))
  .settings(
    inThisBuild(List(
      organization := "rolandtritsch",
      name         := "scala-roland",
      scalaVersion := "2.12.5"
    )),
    libraryDependencies += scalaTest % Test
  )
