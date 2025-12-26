plugins {
    id("java")
    id("org.jetbrains.intellij") version "1.17.2"
}

group = "com.github.sitharaj88.prism_pro_theme"
version = "1.0.0"

repositories {
    mavenCentral()
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

intellij {
    version.set("2023.2.6")
    type.set("IC")
}

tasks {
    patchPluginXml {
        changeNotes.set("""
            <h2>1.0.0 - Initial Release</h2>
            <ul>
                <li>🔮 Prism Pro Dark - Deep purple-black theme with neon accents</li>
                <li>☀️ Prism Pro Light - Soft lavender theme with vibrant colors</li>
                <li>Full UI component coverage</li>
                <li>Comprehensive syntax highlighting</li>
                <li>Git/VCS integration colors</li>
            </ul>
        """.trimIndent())
        sinceBuild.set("232")
        untilBuild.set("253.*")
    }

    buildSearchableOptions {
        enabled = false
    }
}
