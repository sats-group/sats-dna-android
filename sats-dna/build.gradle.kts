@file:Suppress("UnstableApiUsage")

import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlinter)

    id("maven-publish")
}

android {
    namespace = "com.sats.dna"
    compileSdk = 33

    buildFeatures {
        compose = true
    }

    defaultConfig {
        minSdk = 24

        vectorDrawables.useSupportLibrary = true
    }

    signingConfigs {
        val satsMemberAppKeystoreFile: String? by project
        val keystore = File(satsMemberAppKeystoreFile ?: System.getenv("SATS_KEYSTORE_FILE") ?: "")

        register("play-app-signing") {
            if (keystore.exists()) {
                val satsMemberAppKeystorePassword: String? by project
                val satsMemberAppKeyAlias: String? by project
                val satsMemberAppKeyPassword: String? by project

                storeFile = keystore
                storePassword = satsMemberAppKeystorePassword ?: System.getenv("SATS_KEYSTORE_PASSWORD")
                keyAlias = satsMemberAppKeyAlias ?: System.getenv("SATS_KEYSTORE_KEY_ALIAS")
                keyPassword = satsMemberAppKeyPassword ?: System.getenv("SATS_KEYSTORE_KEY_PASSWORD")
            }
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            signingConfig = signingConfigs.getByName("play-app-signing")

            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    composeOptions {
        kotlinCompilerExtensionVersion = libs.versions.compose.compiler.get()
    }

    publishing {
        singleVariant("release") {
            withSourcesJar()
        }
    }
}

tasks.withType<KotlinCompile>().configureEach {
    compilerOptions {
        jvmTarget.set(JvmTarget.JVM_11)
    }
}

dependencies {
    implementation(project(":core-tooling"))

    implementation(platform(libs.androidx.compose.bom))

    implementation(libs.accompanist.insetsUi)
    implementation(libs.androidx.compose.foundation)
    implementation(libs.androidx.compose.material)
    implementation(libs.androidx.compose.runtime)
    implementation(libs.androidx.compose.ui)
    implementation(libs.androidx.compose.ui.tooling.preview)
    implementation(libs.androidx.compose.ui.util)

    debugImplementation(libs.androidx.compose.ui.tooling)
}

publishing {
    repositories {
        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/sats-group/sats-dna-android")

            credentials {
                username = providers.gradleProperty("github.packages.username").orNull
                    ?: System.getenv("GH_PACKAGES_USERNAME")

                password = providers.gradleProperty("github.packages.password").orNull
                    ?: System.getenv("GH_PACKAGES_PASSWORD")
            }
        }
    }

    publications {
        register<MavenPublication>("release") {
            groupId = "com.sats.dna"
            artifactId = "sats-dna"
            version = System.getenv("VERSION_NAME")

            afterEvaluate {
                from(components["release"])
            }
        }
    }
}
