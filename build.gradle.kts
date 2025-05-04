plugins {
    kotlin("jvm") version "1.9.22" apply false
    java
}

allprojects {
    group = "com.financetracker"
    version = "1.0.0"

    repositories {
        mavenCentral()
    }
}

subprojects {
    apply(plugin = "org.jetbrains.kotlin.jvm")
    apply(plugin = "java")

    dependencies {
        implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
        
        // Logging
        implementation("ch.qos.logback:logback-classic:1.4.14")
        implementation("io.github.microutils:kotlin-logging-jvm:3.0.5")
        
        // Testing
        testImplementation("org.jetbrains.kotlin:kotlin-test")
    }

    tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
        kotlinOptions {
            jvmTarget = "21"
            freeCompilerArgs = listOf("-Xjsr305=strict")
        }
    }
} 