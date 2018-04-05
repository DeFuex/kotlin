import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar
import org.gradle.jvm.tasks.Jar

description = "Kotlin IDEA plugin"

plugins {
    `java-base`
}

repositories {
    maven("https://jetbrains.bintray.com/markdown")
}

// Do not rename, used in JPS importer
val projectsToShadow by extra(listOf(
        ":plugins:annotation-based-compiler-plugins-ide-support",
        ":compiler:backend",
        ":compiler:backend-common",
        ":compiler:ir.backend.common",
        ":kotlin-build-common",
        ":compiler:cli-common",
        ":compiler:container",
        ":compiler:daemon-common",
        ":core:metadata",
        ":core:metadata.jvm",
        ":core:descriptors",
        ":core:descriptors.jvm",
        ":core:deserialization",
        ":eval4j",
        ":idea:formatter",
        ":compiler:psi",
        *if (project.findProperty("fir.enabled") == "true") {
            arrayOf(
                ":compiler:fir:cones",
                ":compiler:fir:resolve",
                ":compiler:fir:tree",
                ":compiler:fir:psi2fir"
            )
        } else {
            emptyArray()
        },
        ":compiler:frontend",
        ":compiler:frontend.common",
        ":compiler:frontend.java",
        ":compiler:frontend.script",
        ":idea:ide-common",
        ":idea",
        ":idea:idea-native",
        ":idea:fir-view",
        ":idea:idea-core",
        ":idea:idea-gradle",
        ":idea:idea-gradle-native",
        //":idea-ultimate",
        ":compiler:ir.psi2ir",
        ":compiler:ir.tree",
        ":js:js.ast",
        ":js:js.frontend",
        ":js:js.parser",
        ":js:js.serializer",
        ":js:js.translator",
        ":kotlin-native:kotlin-native-utils",
        ":kotlin-native:kotlin-native-library-reader",
        ":compiler:light-classes",
        ":compiler:plugin-api",
        ":kotlin-preloader",
        ":compiler:resolution",
        ":compiler:serialization",
        ":compiler:util",
        ":core:util.runtime"))

// Do not rename, used in JPS importer
val packedJars by configurations.creating

val sideJars by configurations.creating

dependencies {
    packedJars(protobufFull())
    packedJars(project(":core:builtins", configuration = "builtins"))
    sideJars(project(":kotlin-script-runtime"))
    sideJars(project(":kotlin-stdlib"))
    sideJars(project(":kotlin-stdlib-jdk7"))
    sideJars(project(":kotlin-stdlib-jdk8"))
    sideJars(project(":kotlin-reflect"))
    sideJars(project(":kotlin-compiler-client-embeddable"))
    sideJars(commonDep("io.javaslang", "javaslang"))
    sideJars(commonDep("javax.inject"))
    sideJars(commonDep("org.jetbrains.kotlinx", "kotlinx-coroutines-core")) { isTransitive = false }
    sideJars(commonDep("org.jetbrains.kotlinx", "kotlinx-coroutines-jdk8")) { isTransitive = false }
    sideJars(commonDep("org.jetbrains", "markdown")) { isTransitive = false }
}

val jar = runtimeJar(task<ShadowJar>("shadowJar")) {
    from(files("$rootDir/resources/kotlinManifest.properties"))
    from(packedJars)
    for (p in projectsToShadow) {
        dependsOn("$p:classes")
        from(getSourceSetsFrom(p)["main"].output)
    }
    archiveName = "kotlin-plugin.jar"
}

ideaPlugin {
    duplicatesStrategy = DuplicatesStrategy.FAIL // Investigation is required if we have multiple jars with same name
    dependsOn(":dist")
    from(jar)
    from(sideJars)
}

