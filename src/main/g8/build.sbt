import Dependencies._
import ReleaseTransformations._

lazy val root = (project in file("."))
  .settings(
    scalaVersion := "2.12.4",

    organization := "$gh_user$",
    name := "$gh_repo$",

    logLevel := Level.Info,

    libraryDependencies += scalaTest % Test,
    libraryDependencies += scalaCheck % Test,
    libraryDependencies += scalaMeter % Test,
    libraryDependencies += logbackClassic,
    libraryDependencies += scalaLogging,

    testFrameworks += new TestFramework(
      "org.scalameter.ScalaMeterFramework"
    ),

    logBuffered := false,
    parallelExecution in Test := false,

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
