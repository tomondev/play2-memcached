import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "play2-memcached"
    val appVersion      = "0.2.1-SNAPSHOT"

  val appDependencies = Seq(
    "spy" % "spymemcached" % "2.6",
    "play" %% "play" % "2.1-SNAPSHOT"
  )

  val main = PlayProject(appName, appVersion, appDependencies, mainLang = JAVA).settings(
    organization := "com.github.mumoshu"
  )

 
}
