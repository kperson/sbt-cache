import sbt._
import Keys._

object ScalaCache extends Build {

  val Organization = "com.cache"
  val Name = "Cache"
  val Version = "0.1.0-SNAPSHOT"
  val ScalaVersion = "2.11.1"
  val ScalatraVersion = "2.3.0"

  lazy val cache = Project (
    "cache",
    file("cache"),
    settings = Seq(
      organization := Organization,
      name := "cache",
      version := Version,
      scalaVersion := ScalaVersion,
      resolvers += Classpaths.typesafeReleases,
      libraryDependencies ++= Seq(
      )
    )
  )

}
