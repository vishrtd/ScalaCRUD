name := "ScalaCrud"

version := "0.1"

scalaVersion := "2.12.4"

libraryDependencies ++= Seq(
  "io.spray" % "spray-can" % "1.1-M8",
  "io.spray" % "spray-http" % "1.1-M8",
  "io.spray" % "spray-routing" % "1.1-M8",
  "com.typesafe.akka" %% "akka-actor" % "2.4.16",
  "com.typesafe.akka" %% "akka-slf4j" % "2.5.20",
  "com.typesafe.slick" %% "slick" % "3.3.0",
  "mysql" % "mysql-connector-java" % "5.1.25",
  "net.liftweb" %% "lift-json" % "3.3.0",
  "ch.qos.logback" % "logback-classic" % "1.0.13"
)

resolvers ++= Seq(
  "Spray repository" at "http://repo.spray.io",
  "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"
)