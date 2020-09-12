plugins {
    id("org.springframework.boot") version ("2.2.3.RELEASE")
    id("io.spring.dependency-management") version ("1.0.10.RELEASE")
    java
    maven
}

group = "org.yqj.boot"
version = "1.0.0-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
}


repositories {
    mavenLocal()
    mavenCentral()
}

dependencies {

    compileOnly("org.projectlombok:lombok")
    annotationProcessor("org.projectlombok:lombok")

    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.projectlombok:lombok")
    implementation("com.google.guava:guava:22.0")

    testCompileOnly("org.projectlombok:lombok")
    testAnnotationProcessor("org.projectlombok:lombok")

    testImplementation("org.springframework.boot:spring-boot-starter-test") {
        exclude("org.junit.vintage", "junit-vintage-engine")
    }
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}