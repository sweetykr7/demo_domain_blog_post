import org.springframework.boot.gradle.tasks.bundling.BootJar

version = "0.0.1-SNAPSHOT"

dependencies {
    // service
    implementation(project(":post"))
}

tasks.withType<BootJar>{
    enabled = true
}

tasks.withType<Jar>{
    enabled = false
}