plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)

    alias(libs.plugins.androidx.navigation.safeargs.kotlin)

    alias(libs.plugins.kotlin.parcelize)
    alias(libs.plugins.dagger.hilt.android.plugin)
    alias(libs.plugins.google.services)
    alias(libs.plugins.ksp)
}

android {
    namespace = "dev.imyisus.kelineyt"
    compileSdk = 35

    defaultConfig {
        applicationId = "dev.imyisus.kelineyt"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }

    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.firebase.firestore)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)


//    implementation(libs.simplepass.loading.button.android)
    implementation(libs.loading.button)

    implementation(libs.glide)
    annotationProcessor(libs.glide.compiler) // Para el procesador de anotaciones de Glide

    implementation(libs.circleimageview)
    implementation(libs.viewpagerindicator)
    implementation(libs.stepview)

    // Navigation component (usando 'libs.' para fragment y ui)
    implementation(libs.androidx.navigation.fragment.ktx)
    implementation(libs.androidx.navigation.ui.ktx)

    // Dagger Hilt (usando 'libs.' para android y compiler)
    implementation(libs.hilt.android)
    ksp(libs.hilt.compiler) // Usar ksp en lugar de kapt

    // Firebase
    implementation(libs.firebase.auth)
    implementation(libs.androidx.credentials)
    implementation(libs.androidx.credentials.play.services.auth)
    implementation(libs.googleid)
}