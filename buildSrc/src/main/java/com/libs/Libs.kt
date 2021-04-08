package com.libs

object Libs {
    object Config {
        const val pageName = "com.ola.platform"

        object V {
            const val csv = 30
            const val btv = "30.0.1"
            const val msv = 21
            const val tsv = 30

            const val jvmTarget = "1.8"

            object APP {
                const val versionCode = 1000
                const val versionName = "version1.0.0"
            }
        }
    }


    const val material = "com.google.android.material:material:1.1.0"

    object Kotlin {
        private const val version = "1.3.72"
        const val stdlib = "org.jetbrains.kotlin:kotlin-stdlib:$version"
        const val gradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$version"
    }

    object OkHttp {
        private const val version = "3.11.0"
        private const val coilVersion = "1.1.1"
        const val okHttp = "com.squareup.okhttp3:okhttp:$version"

        const val retrofit2 = "com.squareup.retrofit2:retrofit:2.7.0"
        const val retrofitAdapter = "com.squareup.retrofit2:adapter-rxjava3:2.9.0"
        const val converterGSON = "com.squareup.retrofit2:converter-gson:2.5.0"

        const val converter = "com.squareup.retrofit2:converter-moshi:2.7.0"
        const val logging = "com.squareup.okhttp3:logging-interceptor:3.14.2"

        const val coil = "io.coil-kt:coil:$coilVersion"
        const val coilSvg = "io.coil-kt:coil:$coilVersion"
        const val chunck = "com.readystatesoftware.chuck:library:1.1.0"
        const val chunckNoop = "com.readystatesoftware.chuck:library-no-op:1.1.0"
    }

    object AndroidX {
        const val activity = "androidx.activity:activity-ktx:1.1.0"
        const val appcompat = "androidx.appcompat:appcompat:1.1.0"
        const val coreKtx = "androidx.core:core-ktx:1.2.0"

        object Constraint {
            const val constraintLayout = "androidx.constraintlayout:constraintlayout:1.1.3"
        }

        object Navigation {
            private const val version = "2.3.3"
            const val fragment = "androidx.navigation:navigation-fragment:$version"
            const val ui = "androidx.navigation:navigation-ui:$version"
            const val fragmentKtx = "androidx.navigation:navigation-fragment-ktx:$version"
            const val uiKtx = "androidx.navigation:navigation-ui-ktx:$version"
        }

        object Lifecycle {
            private const val version = "2.3.0"
            const val runtimeKtx = "androidx.lifecycle:lifecycle-runtime-ktx:$version"
            const val liveData = "androidx.lifecycle:lifecycle-livedata-core-ktx:$version"
            const val liveDataKtx = "androidx.lifecycle:lifecycle-livedata-ktx:$version"
            const val reactivestreamsKtx = "androidx.lifecycle:lifecycle-reactivestreams-ktx:$version"
            const val viewModelKtx = "androidx.lifecycle:lifecycle-viewmodel-ktx:$version"
        }

        object Test {
            private const val version = "2.1.0"
            const val core = "androidx.test:core:$version"
            const val rules = "androidx.test:rules:$version"
            const val junit = "junit:junit:4.+"
            const val androidJunitRunner = "androidx.test.runner.AndroidJUnitRunner"

            object Ext {
                private const val version = "1.3.0"
                const val junit = "androidx.test.ext:junit:$version"
            }

            const val espressoCore = "androidx.test.espresso:espresso-core:3.2.0"
        }

        object Room {
            private const val version = "2.3.0"
            const val runtime = "androidx.room:room-runtime:$version"
            const val ktx = "androidx.room:room-ktx:$version"
            const val compiler = "androidx.room:room-compiler:$version"
        }
    }

    object MMKV {
        const val mmkv = "com.tencent:mmkv-static:1.1.0"
    }

    object RXJava {
        const val rxJava = "io.reactivex.rxjava3:rxkotlin:3.0.1"
        const val rxAndroid = "io.reactivex.rxjava3:rxandroid:3.0.0"
    }

    object Google {
        const val localtion = "com.google.android.gms:play-services-location:8.4.0"
        const val okhttpFinal = "cn.finalteam:okhttpfinal:2.0.7"
        //const val  'com.adjust.sdk:adjust-android:4.23.0'
        //const val  'com.android.installreferrer:installreferrer:2.1'
    }

    object Permission {
        const val permission = "com.yanzhenjie:permission:2.0.3"
    }

    object Navigation {
        const val navigation = "com.ashokvarma.android:bottom-navigation-bar:1.3.1"
    }

    object Glide {
        const val glide = "com.github.bumptech.glide:glide:3.7.0"
        const val glideOkHttp3Integration = "com.github.bumptech.glide:okhttp3-integration:1.4.0@aar"
    }

    object Adjust {
        const val adjust = "com.adjust.sdk:adjust-android:4.23.0"
        const val adjustInstall = "com.android.installreferrer:installreferrer:2.1"
    }
}


