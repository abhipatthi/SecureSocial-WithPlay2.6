import PlayKeys._

name    := "SecureSocial_With_Play_2.6"

version := "1.0-SNAPSHOT"

scalaVersion := "2.12.6"

crossScalaVersions := Seq("2.11.12", "2.12.4")

libraryDependencies ++= Seq("ws.securesocial" %% "securesocial" % "master-SNAPSHOT", javaCore,guice, ehcache)

resolvers += Resolver.sonatypeRepo("snapshots")

javacOptions ++= Seq("-source", "1.8", "-target", "1.8", "-encoding", "UTF-8", "-Xlint:-options")

scalacOptions := Seq("-encoding", "UTF-8", "-Xlint", "-deprecation", "-unchecked", "-feature")
lazy val root = (project in file(".")).enablePlugins(PlayJava)

//routesImport ++= Seq("scala.language.reflectiveCalls")
