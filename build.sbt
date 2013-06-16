import AssemblyKeys._

name := "LogbackWAssembly"

version := "1.1"

scalaVersion := "2.10.2"

resolvers += Classpaths.typesafeReleases

libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.0.13"

seq(assemblySettings: _*)

mainClass in assembly := Some("com.knoldus.logme.LogTester")
