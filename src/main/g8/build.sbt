import Dependencies._
import ReleaseTransformations._

lazy val root = (project in file("."))
  .settings(
    scalaVersion := "2.12.5",

    organization := "rolandtritsch",
    name         := "scala-hello",

    libraryDependencies += scalaTest % Test,

    releaseProcess := Seq[ReleaseStep](
      checkSnapshotDependencies,
      inquireVersions,
      runClean,
      runTest,
      setReleaseVersion,
      commitReleaseVersion,
      // the next two steps are taken over by sbt-github-release
      //tagRelease,
      //publishArtifacts,
      releaseStepCommandAndRemaining("githubRelease"),
      setNextVersion,
      commitNextVersion,
      pushChanges
    )
  )
