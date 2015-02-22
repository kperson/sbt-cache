import sbt._
import Keys._

object ScalaCache extends Build {

  val Organization = "com.cache"
  val Name = "Cache"
  val Version = "0.1.0-SNAPSHOT"
  val ScalaVersion = "2.11.5"

  lazy val cache = Project (
    "cache",
    file("cache"),
    settings = Seq(
      organization := Organization,
      name := "cache",
      version := Version,
      scalaVersion := ScalaVersion,
      ivyScala := ivyScala.value map { _.copy(overrideScalaVersion = true) },
      resolvers += Classpaths.typesafeReleases,
      libraryDependencies ++= Seq(
      )
    )
  )

}
