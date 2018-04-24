# My Scala project

![Travis Build Status](https://travis-ci.org/rolandtritsch/scala-hello.svg?branch=master)
[![GitHub Latest Release](http://img.shields.io/github/release/rolandtritsch/scala-hello/all.svg)](https://github.com/rolandtritsch/scala-hello/releases/latest)

* After running `g8 rolandtritsch/scala.g8` you have arrived here :)
* Now you need to ...
  * Create a/the GitHub repo (through/with the browser :))
  * You need to `mv _gitignore .gitignore`
  * You intit the repo with `git init`
  * You add all of the files with `git add .`
  * You make your initial commit with `git commit -m "Initial commit"`
  * Configure the origin with `git remote add origin git@github.com:username/new_repo` (e.g. `git remote add origin git@github.com:rolandtritsch/scala-hello`)
  * Push the changes/the first commit to the repo with `git push --force -u origin master`
  * Get a/the oauth token configured (to make sbt-github-release work)
  * Make the initial release with `sbt "release with-defaults"`
* Now you can try to ...
  * Generate a/the .ensime file with `sbt ensimeConfig`
  * Generate the documentation with `sbt doc`
  * Change the .travis.yml file and enable a/the travis integration on the repository
  * ???
* Last but not least you can start to add code ...
  * And test it with `sbt test`
  * When you are happy you `sbt add/commit/push` your changes
  * And when the release is ready you write the release notes (in the `notes` directory) and publish a new release with `sbt "release withdefaults"`
