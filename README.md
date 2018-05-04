# Roland's Scala project template

![Travis Build Status](https://travis-ci.org/rolandtritsch/scala.g8.svg?branch=master)
[![GitHub Latest Release](http://img.shields.io/github/release/rolandtritsch/scala.g8/all.svg)](https://github.com/rolandtritsch/scala.g8/releases/latest)

This is an/another **opinionated** [giter8](https://github.com/foundweekends/giter8) [template](https://github.com/foundweekends/giter8/wiki/giter8-templates) to create a scala project. My approach is different to the other approaches/templates in the sense that I am building the biggest template possible and leave it to people to remove stuff from it, if this is too heavy.

Amoung other things the template uses/features/demos ...

* The README features a/the minimal set of [badges](https://shields.io)
* The generated HelloWorld has documentation and you can run `sbt doc` to generate the documentation
* There are minimal [ScalaTest](http://www.scalatest.org), [ScalaCheck](https://www.scalacheck.org), [ScalaMeter](https://scalameter.github.io/), ... tests (run `sbt test`)
* The generated scala project has a minimal .travis.yml file (the travis build will get triggered (if you have the [Travis CI](https://travis-ci.org) integration enabled and the repo configured and) when you run `git push`)
* The project features/supports [Emacs/Ensime](http://ensime.github.io) (run `sbt ensimeConfig`)
* The project features/shows/demos a very nice integration of the [sbt-release plugin](https://github.com/sbt/sbt-release) with the [sbt-github-release plugin](https://github.com/ohnosequences/sbt-github-release) (please consult the README of the generated project to see how this works)
* The project uses/features the new [neo-sbt-scalafmt plugin](https://github.com/lucidsoftware/neo-sbt-scalafmt) to format the code

To use this/generate a project ...

* you install g8 (with `brew install giter8`)
* you create a repo on github (with a README in it) and clone it with `git clone ...`
* you cd into the repo/project directory and run `g8 rolandtritsch/scala.g8 --force` (using your github name and the name of the repo to generate the project; using --force to override the existing README)
* you then follow the instructions in the `README.md` of the generated project

To develop/test this ...

* you fork this repo
* you make the changes you want to make
* you run `sbt g8Test` (to run the scripted test in `src/test/g8` on an instance of the template)
* you then `sbt add .` and `sbt commit -m "..."` and `sbt push` your changes (feel free to send me a pull request :))
* to make a release you need to create the release notes (in the `notes` directory) and then you need to run `sbt "release with-defaults"` (Note: this will use sbt-github-release to upload the release artifacts to your github repo. For that to work you need to put an oauth token into ~/.github. Please consult the sbt-github-release README to find out how to do this)
