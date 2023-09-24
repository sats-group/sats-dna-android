@file:Suppress("UnstableApiUsage")

import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlinter)
}

android {
    namespace = "com.sats.dna.sample"
    compileSdk = 34

    buildFeatures {
        compose = true
    }

    defaultConfig {
        minSdk = 24
        targetSdk = 34

        versionCode = System.getenv("VERSION_CODE")?.toIntOrNull()
        versionName = System.getenv("VERSION_NAME")
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
            isMinifyEnabled = true
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
}

tasks.withType<KotlinCompile>().configureEach {
    compilerOptions {
        jvmTarget.set(JvmTarget.JVM_11)

        freeCompilerArgs.add("-Xcontext-receivers")
    }
}

dependencies {
    debugImplementation(libs.androidx.compose.ui.tooling)
    implementation(libs.accompanist.insetsUi)
    implementation(libs.androidx.activity.compose)
    implementation(libs.androidx.compose.foundation)
    implementation(libs.androidx.compose.material)
    implementation(libs.androidx.compose.runtime)
    implementation(libs.androidx.compose.ui)
    implementation(libs.androidx.compose.ui.tooling.preview)
    implementation(libs.androidx.core)
    implementation(libs.androidx.navigation.compose)
    implementation(libs.google.material)
    implementation(libs.kotlin.reflect)
    implementation(platform(libs.androidx.compose.bom))
    implementation(project(":sats-dna"))
}
