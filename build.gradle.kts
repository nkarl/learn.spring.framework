plugins {
	java
	application
	id("org.springframework.boot") version "3.1.0"
	id("io.spring.dependency-management") version "1.1.0"
}

group = "com.in28minutes"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_17

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
}

application {
	mainClass.set("com.in28minutes.learnspringframework.AppGamingBasicJava")
}

tasks.withType<Test> {
	useJUnitPlatform()
}

