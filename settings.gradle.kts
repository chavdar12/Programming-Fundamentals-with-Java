rootProject.name = "Programming-Fundamentals-with-Java"

// Each numbered lesson folder is its own subproject
rootDir.listFiles { f -> f.isDirectory && f.name.matches(Regex("""\d{3}-.*""")) }!!
    .sorted()
    .forEach { include(it.name) }

include("test-support")
