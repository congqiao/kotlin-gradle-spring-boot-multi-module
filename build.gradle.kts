plugins {
    id("org.springframework.boot") version "2.1.7.RELEASE" apply false
    id("io.spring.dependency-management") version "1.0.8.RELEASE" apply false
    kotlin("jvm") version "1.3.41" apply false
    kotlin("plugin.spring") version "1.3.41" apply false
}

subprojects {
    repositories {
        jcenter()
    }
}
