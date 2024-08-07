@file:Suppress("UnstableApiUsage")

plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose.compiler)
    alias(libs.plugins.kotlinter)

    id("maven-publish")
}

android {
    namespace = "com.sats.dna"
    compileSdk = 35

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

    composeCompiler {
        enableStrongSkippingMode = true
    }

    composeCompiler {
        enableStrongSkippingMode = true
    }

    publishing {
        singleVariant("release") {
            withSourcesJar()
        }
    }

    lint.disable += "UsingMaterialAndMaterial3Libraries"
}

kotlin {
    jvmToolchain {
        languageVersion = JavaLanguageVersion.of(17)
    }
}

dependencies {
    api(libs.androidx.compose.material3)
    api(libs.kotlinx.datetime)
    debugImplementation(libs.androidx.compose.ui.tooling)
    implementation(libs.accompanist.insetsUi)
    implementation(libs.androidx.activity.compose)
    implementation(libs.androidx.compose.foundation)
    implementation(libs.androidx.compose.runtime)
    implementation(libs.androidx.compose.ui)
    implementation(libs.androidx.compose.ui.tooling.preview)
    implementation(libs.androidx.compose.ui.util)
    implementation(libs.coil.compose)
    implementation(libs.kotlinx.serialization.json) // required for kotlinx.datetime R8 rules
    implementation(libs.sats.fonts.headline)
    implementation(platform(libs.androidx.compose.bom))
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
