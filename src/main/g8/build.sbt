// give the user a nice default project!
ThisBuild / version := "$version$"
ThisBuild / scalaVersion := "2.13.7"
ThisBuild / organization := "com.example"

val spinalVersion = "1.6.1"

val spinalCore = "com.github.spinalhdl" %% "spinalhdl-core" % spinalVersion
val spinalLib = "com.github.spinalhdl" %% "spinalhdl-lib" % spinalVersion
val spinalIdslPlugin = compilerPlugin("com.github.spinalhdl" %% "spinalhdl-idsl-plugin" % spinalVersion)

lazy val root = (project in file(".")).
  settings(
    name := "$name;format="Camel"$",
    libraryDependencies ++= Seq(spinalCore, spinalLib, spinalIdslPlugin)
  )

fork := true
