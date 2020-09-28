import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("org.springframework.boot") version ("2.2.3.RELEASE")
    id("io.spring.dependency-management") version ("1.0.10.RELEASE")
    kotlin("jvm") version "1.3.72"
    kotlin("plugin.spring") version "1.3.72"
    `maven-publish`
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
}

repositories {
    mavenCentral()
}

publishing {

    publications {
        create<MavenPublication>("maven") {
            groupId = "org.yqj.boot"
            artifactId = "basic"
            version = "2.0.1"
        }
    }

    repositories {
        mavenLocal()
    }
}

dependencies {

    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("com.google.guava:guava:22.0")

    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core")

    testImplementation("org.springframework.boot:spring-boot-starter-test") {
        exclude("org.junit.vintage", "junit-vintage-engine")
    }
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "1.8"
    }
}
