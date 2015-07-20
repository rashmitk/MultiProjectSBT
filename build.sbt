//build.sbt for base project i.e. MultiProjectSBT

name := "MultiProjectSBT"

lazy val commonSettings = Seq(
	organization := "com.cybage.scala.multiprojectsbt",
	version := "0.1.0",
	scalaVersion := "2.11.6"
)

lazy val sp1 = (project in file("subproject1")).settings(commonSettings: _*)
lazy val sp2 = (project in file("subproject2")).settings(commonSettings: _*).dependsOn(sp1)
