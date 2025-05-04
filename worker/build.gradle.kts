plugins {
    application
}

dependencies {
    implementation(project(":shared"))
}

application {
    mainClass.set("com.financetracker.worker.ApplicationKt")
} 