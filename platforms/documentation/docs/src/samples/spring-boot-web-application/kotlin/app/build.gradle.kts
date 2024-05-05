plugins {
    id("org.springframework.boot") version("3.2.5")
    id("io.spring.dependency-management") version("1.1.4")
    java
}

version = "1.0.2"
group = "org.gradle.samples"
//mainClass = "SpringBootWebApplication"
sourceCompatibility = '17'

java {
    sourceCompatibility = JavaVersion.VERSION_17
}

compileOptions {
    sourceCompatibility 17
    targetCompatibility 17
}

repositories {
    mavenCentral()
}

dependencies {
    //implementation(platform("org.springframework.boot:spring-boot-dependencies:2.7.8"))

    implementation("org.springframework.boot:spring-boot-starter")
    testImplementation("org.springframework.boot:spring-boot-starter-test") {
        exclude(mapOf("group" to "org.junit.vintage", "module" to "junit-vintage-engine"))
    }
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}
