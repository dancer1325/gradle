# maven-vs-gradle
## flexibility
* Gradle
  * [by Android](https://developer.android.com/build)
  * [by native development with C/C+](https://github.com/gradle/gradle-native)
* Maven
  * rigid model / difficult to customize
## performance
* Gradle’s features which make it faster
  * Incremental Builds and Build Caching  -- Check '../../runningGradleBuilds/incrementalBuild' --
  * Gradle Daemon -- Check '../../optimizingPerformance' --
* [2x faster in most of cases, 100x faster for large builds]
* consequences
  * faster ship
  * fewer CPU resources → save money
    * *Example:* CI instances
  * engineer more focus on their tasks
* ABI
  * Application Binary Interface
* Check https://github.com/dancer1325/gradle-performance-comparisons
## user experience
* Check
  * '../runningGradleBuilds/gradleInIde'
  * '../runningGradleBuilds/coreConcepts/cli'
  * https://scans.gradle.com/
## dependency management
* both
  * about dependencies
    * cache locally
    * download in parallel
* Maven
  * override a dependency — by — version
  * few built-in dependency scopes
    * *Example:* integration test’s scope == unit test’s scope
  * conflict resolution works with a short path
  * as library producer, just via Optional Dependencies
* Gradle
  * '../authoringGradleBuilds/Composite builds'
  * custom dependency scopes
  * full conflict resolution -- '../workingWithDependencies/customizingResolution' --
  * as library producer
    * API vs Implementation dependencies -- '../authoringJVMBuilds/JavaLibraryPlugin' --
    * Modeling Feature Variants & Optional Dependencies -- '../workingWithDependencies/modelingFeatureVariants' --


---
