pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://papermc.io/repo/repository/maven-public/")
    }
}

rootProject.name = "TenseiMC"

include("TenseiMC-api", "TenseiMC-server")
