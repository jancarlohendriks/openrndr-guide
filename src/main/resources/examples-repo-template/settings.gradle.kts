enableFeaturePreview("VERSION_CATALOGS")
rootProject.name = "openrndr-examples"

val openrndrUseSnapshot = false
val orxUseSnapshot = false
val ormlUseSnapshot = false

dependencyResolutionManagement {
    versionCatalogs {
        create("libs") {
            version("kotlin", "1.6.10")
            version("openrndr", if (openrndrUseSnapshot) "0.5.1-SNAPSHOT" else "@openrndrVersion@")
            version("orx", if (orxUseSnapshot) "0.5.1-SNAPSHOT" else "@orxVersion@")
            version("orml", if (ormlUseSnapshot) "0.5.1-SNAPSHOT" else "@ormlVersion@")

            plugin("kotlin-jvm", "org.jetbrains.kotlin.jvm").version("1.6.10")
            plugin("shadow", "com.github.johnrengelman.shadow").version("7.1.0")
            plugin("runtime", "org.beryx.runtime").version("1.12.7")

            plugin("gitarchive-tomarkdown", "org.openrndr.extra.gitarchiver.tomarkdown").versionRef("orx")

            library("kotlin-script-runtime", "org.jetbrains.kotlin", "kotlin-script-runtime").versionRef("kotlin")

            version("slf4j", "1.7.32")
            library("slf4j-nop", "org.sl4j", "slf4j-nop").versionRef("slf4j")
            library("slf4j-simple", "org.sl4j", "slf4j-simple").versionRef("slf4j")

            version("jackson", "2.11.1")
            library("jackson-databind", "com.fasterxml.jackson.core", "jackson-databind").versionRef("jackson")
            library("jackson-json", "com.fasterxml.jackson.dataformat", "jackson-dataformat-yaml").versionRef("jackson")

            version("log4j", "2.17.2")
            library("log4j-slf4j", "org.apache.logging.log4j", "log4j-slf4j-impl").versionRef("log4j")

            version("kotlinx-coroutines", "1.6.0")
            library(
                "kotlinx-coroutines-core",
                "org.jetbrains.kotlinx",
                "kotlinx-coroutines-core"
            ).versionRef("kotlinx-coroutines")

            library("kotlin-logging", "io.github.microutils:kotlin-logging-jvm:2.1.21")
            library("junit", "junit:junit:4.13.2")

            library("jsoup", "org.jsoup:jsoup:1.14.3")
            library("gson", "com.google.code.gson:gson:2.9.0")
            library("csv", "com.github.doyaaaaaken:kotlin-csv-jvm:1.2.0")
        }
    }
}

pluginManagement {
    repositories {
        mavenLocal()
        gradlePluginPortal()
    }
}
