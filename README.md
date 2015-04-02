# sbt-gitignore

An [sbt](http://www.scala-sbt.org/) (Simple Build Tool) plugin for adding generic `.gitignore` files to your projects.

## Add Plugin

You can enable the plugin in any given project by adding this into the `project/plugins.sbt` file:
```
addSbtPlugin("com.alpeb" % "sbt-gitignore" % "1.0.0")
```

To have it available in all your projects, add that line into the `~/.sbt/plugins/plugins.sbt` file.

### Usage

To add a generic `.gitignore` file to your project, just type `gen-gitignore` in the `sbt` console.

To add more entries to the ones provided by default, append the file names/patterns to the `gitIgnoreFiles` setting in your `build.sbt` file, for example:
```
gitIgnoreFiles := gitIgnoreFiles.value + "/somefile.ext"
```