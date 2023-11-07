@file:Suppress("UnstableApiUsage")

pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
        mavenLocal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)

    repositories {
        google()
        mavenCentral()
        mavenLocal()

        maven("https://maven.pkg.github.com/sats-group/sats-headline-font-android") {
            credentials {
                username = providers.gradleProperty("github.packages.username").orNull
                    ?: System.getenv("GH_PACKAGES_USERNAME")

                password = providers.gradleProperty("github.packages.password").orNull
                    ?: System.getenv("GH_PACKAGES_PASSWORD")
            }
        }
    }
}

rootProject.name = "sats-dna-android"

include(":sample-app")
include(":sats-dna")
