pluginManagement {
	repositories {
		maven {
			url = uri("https://maven.minecraftforge.net/")
		}
		maven {
			url = uri("https://maven.neoforged.net/releases")
		}
		mavenLocal()
		gradlePluginPortal()
	}
}

dependencyResolutionManagement {
	repositoriesMode.set(RepositoriesMode.PREFER_PROJECT)
}

plugins {
	id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}

include(":appForge")
include(":appNeoForge")