name := """wineplotstracker"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala, SbtWeb)

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  jdbc,
  cache,
  ws,
  evolutions,
  "org.scalatestplus.play" %% "scalatestplus-play" % "1.5.0-RC1" % Test,
  "org.scalaz" % "scalaz-core_2.11" % "7.2.4",
  "org.reactivemongo" %% "play2-reactivemongo" % "0.11.11",
  "org.webjars" % "bootstrap" % "3.3.7-1"
)

resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"

routesImport += "java.util.UUID"

LessKeys.compress in Assets := true
