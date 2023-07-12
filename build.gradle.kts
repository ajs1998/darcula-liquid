plugins {
    id("java")
    id("org.jetbrains.intellij") version "1.14.1"
}

group = "me.alexjs.theme"
version = "2.8"

repositories {
    mavenCentral()
}

// Configure Gradle IntelliJ Plugin - read more: https://github.com/JetBrains/gradle-intellij-plugin
intellij {
    version.set("2023.1.3")
    plugins.set(listOf(/* Plugin Dependencies */))
}

tasks {
    patchPluginXml {
        // https://plugins.jetbrains.com/docs/intellij/build-number-ranges.html#intellij-platform-based-products-of-recent-ide-versions
        sinceBuild.set("211")
        untilBuild.set("232.*")
    }

    signPlugin {
        certificateChain.set(System.getenv("CERTIFICATE_CHAIN"))
        privateKey.set(System.getenv("PRIVATE_KEY"))
        password.set(System.getenv("PRIVATE_KEY_PASSWORD"))
    }

    publishPlugin {
        token.set(System.getenv("PUBLISH_TOKEN"))
    }

    wrapper {
        gradleVersion = "8.2"
        distributionType = Wrapper.DistributionType.ALL
    }
}
