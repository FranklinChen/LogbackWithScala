name := "LogbackWAssembly"

version := "1.1"

scalaVersion := "2.11.5"

resolvers += Classpaths.typesafeReleases

libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.1.2"

mainClass in assembly := Some("com.knoldus.logme.LogTester")
