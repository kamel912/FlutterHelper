plugins {
    id("java")
    id("org.jetbrains.kotlin.jvm") version "1.6.20"
    id("org.jetbrains.intellij") version "1.5.2"
}



group = "com.mkprogs"
version = "1.0.2"

repositories {
    mavenCentral()
}

// Configure Gradle IntelliJ Plugin - read more: https://github.com/JetBrains/gradle-intellij-plugin
intellij {
    version.set("212.5712.43")
    type.set("IC") // Target IDE Platform

    plugins.set(listOf("com.intellij.java"))
}

tasks {
    // Set the JVM compatibility versions
    withType<JavaCompile> {
        sourceCompatibility = "11"
        targetCompatibility = "11"
    }
    withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
        kotlinOptions.jvmTarget = "11"
    }

    patchPluginXml {
        sinceBuild.set("212")
        untilBuild.set("223.*")
    }

    signPlugin {
        certificateChain.set(System.getenv("CERTIFICATE_CHAIN")?.let {File(it).readText()})
        privateKeyFile.set(System.getenv("PRIVATE_KEY_FILE")?.let { File(it) })
        privateKey.set(System.getenv("PRIVATE_KEY_FILE")?.let {File(it).readText()})
        password.set(System.getenv("PRIVATE_KEY_PASSWORD"))
    }

    publishPlugin {
        token.set(System.getenv("PUBLISH_TOKEN"))
    }

    buildSearchableOptions {
        enabled = false
    }


    runIde {

//        ideDir.set(file("C:\\Program Files\\Android\\Android Studio"))
        autoReloadPlugins.set(true)
//        ideDir.set(file("D:\\Jet Brains\\ideaIC"))
        jvmArgs("--add-exports", "java.base/jdk.internal.vm=ALL-UNNAMED")
    }
}


tasks.test {
    useJUnitPlatform()
}


dependencies{
    implementation("com.fleshgrinder.kotlin:case-format:0.2.0")
    testImplementation(kotlin("test"))
    testImplementation("org.junit.jupiter:junit-jupiter:5.9.0")
}