subprojects {
    apply(plugin = "java")

    repositories {
        mavenCentral()
    }

    tasks.withType<JavaCompile>().configureEach {
        options.release = 25
        options.encoding = "UTF-8"
    }
}

project(":test-support") {
    dependencies {
        "implementation"(platform("org.junit:junit-bom:5.13.4"))
        "implementation"("org.junit.jupiter:junit-jupiter-api")
    }
}

configure(subprojects.filter { it.name != "test-support" }) {
    extensions.configure<SourceSetContainer> {
        named("main") { java.setSrcDirs(listOf("src")) }
        named("test") { java.setSrcDirs(listOf("test")) }
    }

    dependencies {
        "testImplementation"(project(":test-support"))
        "testImplementation"(platform("org.junit:junit-bom:5.13.4"))
        "testImplementation"("org.junit.jupiter:junit-jupiter")
        "testRuntimeOnly"("org.junit.platform:junit-platform-launcher")
    }

    tasks.withType<Test>().configureEach {
        useJUnitPlatform()
        testLogging {
            events("failed")
            exceptionFormat = org.gradle.api.tasks.testing.logging.TestExceptionFormat.FULL
        }
    }
}
