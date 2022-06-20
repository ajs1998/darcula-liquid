plugins {
    id("java")
    id("org.jetbrains.intellij") version "1.5.2"
}

group = "me.alexjs.theme"
version = "1.1"

repositories {
    mavenCentral()
}

// Configure Gradle IntelliJ Plugin - read more: https://github.com/JetBrains/gradle-intellij-plugin
intellij {
    version.set("2022.1.2")
    plugins.set(listOf(/* Plugin Dependencies */))
}

tasks {
    patchPluginXml {
        sinceBuild.set("211")
    }

    signPlugin {
        certificateChain.set(System.getenv("CERTIFICATE_CHAIN"))
        privateKey.set(System.getenv("PRIVATE_KEY"))
        password.set(System.getenv("PRIVATE_KEY_PASSWORD"))
    }

    publishPlugin {
        token.set(System.getenv("PUBLISH_TOKEN"))
    }
}
