package com.alpeb.sbtgitignore

import sbt._
import Keys._
import IO._

object SbtGitignore extends AutoPlugin {

  object autoImport {
    val gitIgnoreFiles = settingKey[String]("The desired contents for the .gitignore file")
    val genGitignore = TaskKey[Unit]("gen-gitignore", "Generates a generic .gitignore file")
  }

  import autoImport._

  override def trigger = allRequirements

  override lazy val projectSettings = Seq(
    gitIgnoreFiles := """# VIM temporary files
*.swp

# Emacs temporary files
\#*#
.#*

# SBT
project/project
project/target
target
dist

# IDE project files/directories
/.idea
/.idea_modules
/*.iml
/.ensime*
/.classpath
/.project

# Mac files
.DS_Store

# Others
logs
tmp
tags
.history
/.settings
.cache
/out
/RUNNING_PID
/nohup.out
""",
    genGitignore := {
      IO.write(baseDirectory.value / ".gitignore", gitIgnoreFiles.value)
    })
}
