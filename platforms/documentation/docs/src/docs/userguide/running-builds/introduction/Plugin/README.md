- Gradle
    - == dependencyResolutionEngine + plugins

- := software / provides additional functionality to the Gradle build system
    - — via — [Gradle API](https://github.com/gradle/gradle/blob/master/build-logic-commons/basics/src/main/kotlin/gradlebuild/basics/PublicApi.kt)
    - *Example of additional functionalities*
        - new tasks
        - extend basic Gradle model
        - new configurations
        - …

- uses
    - organize build logic
    - distribute custom tasks — as — packaged code
        - ways to distribute them
            - Core Plugins -- Check '../reference'
            - [Gradle Plugin Portal](https://plugins.gradle.org/) — Community Plugins —
            - Custom Plugins — via — https://docs.gradle.org/current/dsl/org.gradle.api.tasks.javadoc.Javadoc.html
              - *Example:* https://plugins.gradle.org/plugin/org.springframework.boot
            - Convention Plugins -- Check '../../authoringJVMBuilds/structuringBuilds' --

- JVM plugins -- Check '../../authoringJVMBuilds/jvmPlugins' -- 

- applying a plugin
    - := add a plugin to a build -- Check '../basics'
        - — can also implicitly — apply other plugins
          - *Example:* Application plugin  -- Check '../../authoringJVMBuilds' --
        - add methods & properties to a project
    - how to add a plugin?

    ```
    plugins {
        id «plugin id» version «plugin version»
        # If Core Plugins → NOT need to specify version
    }
    ```
