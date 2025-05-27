buildscript {
    dependencies {
        classpath("com.google.dagger:hilt-android-gradle-plugin:2.51.1")
        classpath("com.google.gms:google-services:4.4.2")

        val navversion = "2.9.0"
        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:$navversion")
    }
}
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false

    alias(libs.plugins.androidx.navigation.safeargs.kotlin) apply false

    alias(libs.plugins.kotlin.parcelize) apply false
    alias(libs.plugins.dagger.hilt.android.plugin) apply false
    alias(libs.plugins.google.services) apply false

    alias(libs.plugins.ksp) apply false
}