TODO:

* Dependency Management
  * built-in by Gradle
  * dependencies refer to
    * JARs
    * plugins
    * libraries

* TODO:

* `libs.versions.toml`
  * := version catalog / centralize your dependency declaration
    * placed under ‘/gradle’
    * allows
      * making easier between subprojects, share
        * dependencies
        * version configurations
      * getting autocompletions by the IDE
    * sections
      * `[versions]`
        * versions of
          * libraries &
          * plugins
      * `[libraries]`
      * `[bundles]`
        * == define set of dependencies
      * `[plugins]`

* Task
  * := basic unit of work of a project
    * defined inside a
      * build script OR
      * plugin
    * exist built-in tasks -- Check '../tutorial'
      * `Copy`
      * `Delete`
      * `Exec`
      * `Zip`
    * *Example:*
      * compile a code
      * run a test
  * task’s states
    * got it after running a task
    * `UP-TO-DATE`
      * == already executed & NOT changed  -- check incremental building --
    * `SKIPPED`
      * == explicitly prevented from running
    * `FROM-CACHE`
      * == copied from building cache
    * `NO-SOURCE`
      * == NOT executed because required inputs NOT available

* Plugin
  * Gradle
    * == dependencyResolutionEngine + plugins
  * := software / provides additional functionality to the Gradle build system
    * *Example of additional functionalities*
      * new tasks
      * new configurations
      * …
  * uses
    * organize build logic
    * distribute custom tasks — as — packaged code
      * ways to distribute them
        * Core Plugins  -- Check '../reference'
        * [Gradle Plugin Portal](https://plugins.gradle.org/) — Community Plugins —
        * Custom Plugins — via — https://docs.gradle.org/current/dsl/org.gradle.api.tasks.javadoc.Javadoc.html
        * Convention Plugins  -- Check '../AuthorinPlugins' --

* Incremental builds & build caching
  * allows
    * := build / if inputs of the previous build have NOT changed → 👁️ skip running tasks 👁️
      * requirements
        * tasks must define
          * inputs
          * outputs
  * ways to display task state
    * `… --console=verbose`
    * `org.gradle.console=verbose` in ‘gradle.properties’
  * incremental build
    * ⚠️if you switch to other branches → it does NOT recognize it → use build caching⚠️
    * `UP-TO-DATE`
      * task state /  skiped to run by incremental build
  * build caching
    * how does it work?
      * store previous built results
    * uses
      * share across teams
      * speed up builds
        * local
        * CI
    * `FROM-CACHE`
      * task state /  skipped to run by build caching

TODO:
