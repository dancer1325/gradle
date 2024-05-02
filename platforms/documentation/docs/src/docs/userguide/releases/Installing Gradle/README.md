* 👁️ Android Studio comes with a working installation of Gradle 👁️
  * Note: → NOT need to install it

# Prerequisites
* Java JDK >8
  * where does it look for?
    * defined in `$PATH` or `$JAVA_HOME`
    * used by the IDE
    * specified by the project
  * 👁️ although Gradle supports Kotlin & Groovy as build languages — NO need to install them 👁️
    * **Reason:** 🧠 Gradle ships with its own Kotlin & Groovy libraries 🧠

# Ways to install it
* via package manager
  * **Note:** 👀 Others package manager could offer a Gradle tool, but it’s not controlled by Gradle Inc. 👀
  * [SDKMAN](https://sdkman.io/)
  * [Homebrew](https://brew.sh/)
* via binary / source code
* `gradle -v`
  * check the installation

# Gradle Wrapper
* NO need to install gradle
* Check '../reference/gradleWrapper'
