plugins {
    id("com.android.application")
}

android {
    namespace = "com.crushmate.app"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.crushmate.app"
        minSdk = 24          // Android 7.0 et plus : couvre Android 12 et le Galaxy Note 20
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}
