pluginManagement {
    includeBuild("build-logic")
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}

@Suppress("UnstableApiUsage")
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.PREFER_SETTINGS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "TheMovieDb"
include(":app")
include (":core:network")
include (":features:movies")
include (":core:common")
include (":core:local")
include (":core:ui_kit")
include (":features:details_movie")
include (":features:favorites")
