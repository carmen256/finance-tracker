plugins {
    kotlin("jvm")
    id("io.ktor.plugin") version "2.3.8"
    id("org.flywaydb.flyway") version "10.0.0"
}

dependencies {
    implementation(project(":shared"))
    
    // Ktor
    implementation("io.ktor:ktor-server-core-jvm")
    implementation("io.ktor:ktor-server-netty-jvm")
    implementation("io.ktor:ktor-server-content-negotiation-jvm")
    implementation("io.ktor:ktor-serialization-kotlinx-json-jvm")
    implementation("io.ktor:ktor-server-auth-jvm")
    implementation("io.ktor:ktor-server-auth-jwt-jvm")
    
    // Database
    implementation("org.jetbrains.exposed:exposed-core:0.45.0")
    implementation("org.jetbrains.exposed:exposed-dao:0.45.0")
    implementation("org.jetbrains.exposed:exposed-jdbc:0.45.0")
    implementation("org.postgresql:postgresql:42.7.1")
    implementation("com.zaxxer:HikariCP:5.1.0")
    
    // Migrations
    implementation("org.flywaydb:flyway-core:10.0.0")
    
    // Testing
    testImplementation("io.ktor:ktor-server-test-host-jvm")
    testImplementation("io.ktor:ktor-server-tests-jvm")
}

application {
    mainClass.set("com.financetracker.backend.ApplicationKt")
}

// Flyway configuration
flyway {
    url = "jdbc:postgresql://localhost:5432/finance_tracker"
    user = "postgres"
    password = "postgres"
    locations = arrayOf("filesystem:backend/src/main/resources/db/migration")
} 