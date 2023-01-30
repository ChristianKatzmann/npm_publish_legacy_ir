# `kotlin.js.compiler`

## Command:

```shell
./gradlew :angular:tasks --group=Publishing
```

## Output:

### `kotlin.js.compiler` missing

```
FAILURE: Build failed with an exception.

* Where:
Build file '/Users/ck/Projects/npm_publish_legacy_ir/angular/build.gradle.kts' line: 2

* What went wrong:
An exception occurred applying plugin request [id: 'dev.petuska.npm.publish', version: '3.2.0']
> Failed to apply plugin 'dev.petuska.npm.publish'.
   >
     ==========
     This project currently uses the Kotlin/JS Legacy compiler backend, which has been deprecated and will be removed in a future release.
     Please migrate the project to the new IR-based compiler (https://kotl.in/jsir) by adding:
     - kotlin.js.compiler=ir to your gradle.properties file.
     - js(IR) { ... } to your build file.
     You can continue to use the deprecated legacy compiler in the current version of the toolchain by specifying it explicitly.
     ==========


* Try:
> Run with --stacktrace option to get the stack trace.
> Run with --info or --debug option to get more log output.
> Run with --scan to get full insights.

* Get more help at https://help.gradle.org

BUILD FAILED in 296ms
```

### `kotlin.js.compiler` via `gradle.properties`

```
> Task :angular:tasks

------------------------------------------------------------
Tasks runnable from project ':angular'
------------------------------------------------------------

Publishing tasks
----------------
publish
publishJsPackageToGithubRegistry - Publishes NPM package to NPM registry

To see all tasks and more detail, run gradlew tasks --all

To see more detail about a task, run gradlew help --task <task>

Deprecated Gradle features were used in this build, making it incompatible with Gradle 9.0.

You can use '--warning-mode all' to show the individual deprecation warnings and determine if they come from your own scripts or plugins.

See https://docs.gradle.org/8.0-rc-2/userguide/command_line_interface.html#sec:command_line_warnings

BUILD SUCCESSFUL in 309ms
1 actionable task: 1 executed
```
