plugins {
    id("io.ktor.plugin") version "2.3.8"
}

dependencies {
    implementation(project(":shared"))
    
    // Ktor
    implementation("io.ktor:ktor-server-core-jvm")
    implementation("io.ktor:ktor-server-netty-jvm")
}

application {
    mainClass.set("com.financetracker.api.ApplicationKt")
} 