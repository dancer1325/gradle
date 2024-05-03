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

TODO:
