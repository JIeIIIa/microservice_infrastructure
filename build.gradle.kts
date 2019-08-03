plugins {
    java
    eclipse
    id("org.springframework.boot") version "2.1.6.RELEASE" apply false
}

allprojects {
    group = "it.discovery"
}

subprojects {
    apply(plugin = "java")
    apply(plugin = "org.springframework.boot")

    java.sourceCompatibility = JavaVersion.VERSION_11
    java.targetCompatibility = JavaVersion.VERSION_11

    val cloudStarterVersion = "Greenwich.RELEASE"

    repositories {
        jcenter()
    }

    dependencies {
        compile("org.springframework.boot:spring-boot-devtools")
        compileOnly("org.projectlombok:lombok:1.18.8")
        annotationProcessor("org.projectlombok:lombok:1.18.8")

        implementation(platform(
                "org.springframework.cloud:spring-cloud-starter-parent:$cloudStarterVersion"))
    }

}

