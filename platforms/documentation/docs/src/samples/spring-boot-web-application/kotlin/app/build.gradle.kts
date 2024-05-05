plugins {
    id("org.springframework.boot") version("3.2.5")
    id("io.spring.dependency-management") version("1.1.4")
    java
}

version = "1.0.2"
group = "org.gradle.samples"
//mainClassName = "com.springboot.SpringBootWebApplication"
//mainClass = "com.springboot.SpringBootWebApplication"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}
