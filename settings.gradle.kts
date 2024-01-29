pluginManagement {
	repositories {
		maven("https://maven.minecraftforge.net")
		maven("https://maven.neoforged.net/releases")
		mavenLocal()
		mavenCentral()
		gradlePluginPortal()
	}
}

dependencyResolutionManagement {
	repositoriesMode.set(RepositoriesMode.PREFER_PROJECT)
	repositories {
		maven("https://maven.minecraftforge.net")
		maven("https://maven.neoforged.net/releases")
		mavenLocal()
		mavenCentral()
		gradlePluginPortal()
	}
}

plugins {
	id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}

include(":appForge")
include(":appNeoForge")