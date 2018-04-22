import ReleaseTransformations._

lazy val root = (project in file("."))
  .settings(
    organization := "rolandtritsch",
    name := "scala.g8",

    test in Test := {
      val _ = (g8Test in Test).toTask("").value
    },

    scriptedLaunchOpts ++= List("-Xms1024m", "-Xmx1024m", "-XX:ReservedCodeCacheSize=128m", "-XX:MaxPermSize=256m", "-Xss2m", "-Dfile.encoding=UTF-8"),
    resolvers += Resolver.url("typesafe", url("http://repo.typesafe.com/typesafe/ivy-releases/"))(Resolver.ivyStylePatterns),

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
