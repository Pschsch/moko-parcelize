/*
 * Copyright 2019 IceRock MAG Inc. Use of this source code is governed by the Apache 2.0 license.
 */

object Versions {
    object Android {
        const val compileSdk = 28
        const val targetSdk = 28
        const val minSdk = 16
    }

    const val kotlin = "1.3.60"

    object Plugins {
        const val kotlin = Versions.kotlin
        const val androidExtensions = Versions.kotlin
    }

    object Libs {
        object Android {
            const val appCompat = "1.0.2"
        }

        object MultiPlatform {
            const val mokoParcelize: String = "0.1.0"
        }
    }
}