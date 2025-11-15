plugins {
    kotlin("multiplatform") version "2.2.20"
}

group = "org.itmo.practice"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

val kotestVersion = "6.0.4"
val koinVersion = "4.0.4"

kotlin {
    jvm()

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation("io.insert-koin:koin-core:$koinVersion")
            }
        }

        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
                implementation("io.kotest:kotest-assertions-core:$kotestVersion")
                implementation("io.kotest:kotest-framework-engine:$kotestVersion")
            }
        }

        val jvmMain by getting {
            dependencies {
                implementation("io.insert-koin:koin-core-jvm:$koinVersion")
            }
        }

        val jvmTest by getting {
            dependencies {
                implementation("io.kotest:kotest-runner-junit5:$kotestVersion")
            }
        }
    }
}

tasks.named<Test>("jvmTest") {
    useJUnitPlatform()
}
