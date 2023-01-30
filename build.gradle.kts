import org.jetbrains.kotlin.gradle.dsl.KotlinTopLevelExtension
import org.jetbrains.kotlin.gradle.plugin.KotlinBasePlugin

@Suppress("DSL_SCOPE_VIOLATION")
plugins {
  alias(libs.plugins.kotlin.js) apply false
}

subprojects {
  plugins.withType<KotlinBasePlugin> {
    configure<KotlinTopLevelExtension> {
      jvmToolchain(17)
    }
  }
}
