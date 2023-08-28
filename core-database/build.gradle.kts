plugins {
	id("com.android.library")
	id("org.jetbrains.kotlin.android")
	id("com.google.devtools.ksp")
	id("org.jetbrains.kotlin.kapt")
}

android {
	namespace = "com.jaden.core_database"
	compileSdk = 33

	defaultConfig {
		minSdk = 24
		testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
	}

	buildTypes {}
	compileOptions {
		sourceCompatibility = JavaVersion.VERSION_17
		targetCompatibility = JavaVersion.VERSION_17
	}
	kotlinOptions {
		jvmTarget = "17"
	}
}

dependencies {

	implementation("androidx.room:room-runtime:2.5.2")
	annotationProcessor("androidx.room:room-compiler:2.5.2")
	ksp("androidx.room:room-compiler:2.5.2")
	implementation("androidx.room:room-ktx:2.5.2")

	implementation("com.google.dagger:hilt-android:2.47")
	kapt("com.google.dagger:hilt-android-compiler:2.47")

	implementation("androidx.core:core-ktx:1.10.1")
	implementation("androidx.appcompat:appcompat:1.6.1")
	testImplementation("junit:junit:4.13.2")
	androidTestImplementation("androidx.test.ext:junit:1.1.5")
	androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}

kapt {
	correctErrorTypes = true
}
