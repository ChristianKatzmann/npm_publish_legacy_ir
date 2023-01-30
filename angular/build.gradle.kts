@Suppress("DSL_SCOPE_VIOLATION")
plugins {
  alias(libs.plugins.kotlin.js)
  //alias(libs.plugins.npm.publish)
}

kotlin {
  explicitApi()

  js(IR) {
    browser()

    binaries.library()
  }

  sourceSets {
    all {
      languageSettings {
        optIn("kotlin.js.ExperimentalJsExport")
      }
    }
  }
}

/*
npmPublish {
  organization.set("myorg")

  packages {
    named("js") {
      packageJson {
        repository {
          type.set("git")
          url.set("https://github.com/ChristianKatzmann/npm_publish_legacy_ir.git")
        }
      }
    }
  }

  registries {
    github {
      authToken.set("obfuscated")
    }
  }
}
 */
