routesGenerator := InjectedRoutesGenerator

name := """whattowatch"""
organization := "com.whattowatch"

version := "1.0-SNAPSHOT"

lazy val myProject = (project in file("."))
  .enablePlugins(PlayJava, PlayEbean)

scalaVersion := "2.11.11"

libraryDependencies += guice

// include the H2 Dependency

libraryDependencies += "com.h2database" % "h2" % "1.4.192"

// Load dependencies

libraryDependencies ++= Seq(evolutions, jdbc)