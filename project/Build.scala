import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

    val appName         = "play2-memcached"
    val appVersion      = "0.2.1-LC2"

  val appDependencies = Seq(
    "spy" % "spymemcached" % "2.6"
 
  )

  val main = play.Project(appName, appVersion, appDependencies).settings(
    resolvers += "Spy Repository" at "http://files.couchbase.com/maven2/",
    organization := "com.github.mumoshu"
  )

 
}
