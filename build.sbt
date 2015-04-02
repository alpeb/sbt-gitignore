import bintray.Keys._

name := "sbt-gitignore"

organization := "com.alpeb"

version := "1.0.1"

sbtPlugin := true

publishMavenStyle := false

bintrayPublishSettings

repository in bintray := "sbt-plugins"

licenses += ("Apache-2.0", url("https://www.apache.org/licenses/LICENSE-2.0.html"))

bintrayOrganization in bintray := None
