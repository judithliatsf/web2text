name := "Boilerplate"

organization := "nl.tvogels"

version:= "2.0-SNAPSHOT"

scalaVersion := "2.11.12"

cancelable in Global := true
fork in run := true

libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.0" % "test"
libraryDependencies += "org.scalanlp" %% "breeze" % "0.11.2"
libraryDependencies += "org.mongodb" %% "casbah" % "3.1.0"

excludeFilter in Runtime in unmanagedResources := "*.html" || "*.csv"