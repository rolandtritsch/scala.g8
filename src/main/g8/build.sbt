import Dependencies._
import ReleaseTransformations._

lazy val root = (project in file("."))
  .settings(
    scalaVersion := "2.12.4",
    ensimeIgnoreScalaMismatch := true,

    organization := "$gh_user$",
    name         := "$gh_repo$",

    libraryDependencies += scalaTest % Test,
    libraryDependencies += scalaCheck % Test,
    libraryDependencies += scalaMeter % Test,

    testFrameworks += new TestFramework(
      "org.scalameter.ScalaMeterFramework"
    ),

    releaseProcess := Seq[ReleaseStep](
      checkSnapshotDependencies,
      inquireVersions,
      runClean,
      runTest,
      setReleaseVersion,
      commitReleaseVersion,
      tagRelease,
      // for sbt-github-release to work, we need to add an additional step and need to push the tag first
      pushChanges,
      // the next step is taken over by sbt-github-release
      //publishArtifacts,
      releaseStepCommand("githubRelease"),
      setNextVersion,
      commitNextVersion,
      pushChanges
    )
  )
