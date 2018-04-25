# My Scala project

![Travis Build Status](https://travis-ci.org/$gh_user$/$gh_repo$.svg?branch=master)
[![GitHub Latest Release](http://img.shields.io/github/release/$gh_user$/$gh_repo$/all.svg)](https://github.com/$gh_user$/$gh_repo$/releases/latest)

* After running `g8 rolandtritsch/scala.g8` you have arrived here :)
* Now you need to ...
  * You need to `mv _gitignore .gitignore`
  * You add all of the files with `git add .`
  * You make your initial commit with `git commit -m "Initial commit"`
  * Push the changes/the first commit to the repo with `git push`
  * Get a/the oauth token configured (to make sbt-github-release work)
  * Make the initial release with `sbt "release with-defaults"`
* Now you can try to ...
  * Run `sbt test` and `sbt run`
  * Generate a/the .ensime file with `sbt ensimeConfig`
  * Generate the documentation with `sbt doc`
  * Change the .travis.yml file and enable a/the travis integration on the repository
  * ???
* Last but not least you can start to add code ...
  * And test it with `sbt test`
  * When you are happy you `sbt add/commit/push` your changes
  * And when the release is ready you write the release notes (in the `notes` directory) and publish a new release with `sbt "release withdefaults"`
