rootProject.name = "npm_publish_legacy_ir"

pluginManagement {
  repositories {
    google()
    gradlePluginPortal()
  }
}

plugins {
  //id("org.gradle.toolchains.foojay-resolver-convention") version "0.4.0"
}

@Suppress("UnstableApiUsage")
dependencyResolutionManagement {
  // Build was configured to prefer settings repositories over project repositories but repository 'Node Distributions at https://nodejs.org/dist' was added by unknown code
  //repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)

  repositories {
    google()
    mavenCentral()
  }
}

include(":angular")
