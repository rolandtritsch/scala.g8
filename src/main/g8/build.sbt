import Dependencies._
import ReleaseTransformations._

lazy val root = (project in file("."))
  .settings(
    inThisBuild(List(
      organization := "rolandtritsch",
      name         := "scala-hello",
      scalaVersion := "2.12.5"
    )),

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
