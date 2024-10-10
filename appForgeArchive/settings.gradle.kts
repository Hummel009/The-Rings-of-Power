pluginManagement {
	repositories {
		maven {
			name = "GTNH Maven"
			url = uri("http://jenkins.usrv.eu:8081/nexus/content/groups/public/")
			isAllowInsecureProtocol = true
			mavenContent {
				includeGroup("com.gtnewhorizons")
				includeGroup("com.gtnewhorizons.retrofuturagradle")
			}
		}
		maven("https://maven.minecraftforge.net/")
		maven("https://maven.fabricmc.net")
		maven("https://repo.sleeping.town")
		maven("https://maven.architectury.dev/")
		maven("https://repo.sk1er.club/repository/maven-releases/")
		mavenLocal()
		mavenCentral()
		gradlePluginPortal()
	}
	resolutionStrategy {
		eachPlugin {
			when (requested.id.id) {
				"gg.essential.loom" -> useModule("gg.essential:architectury-loom:${requested.version}")
				"agency.highlysuspect.voldeloom" -> {}
			}
		}
	}
}

dependencyResolutionManagement {
	repositoriesMode.set(RepositoriesMode.PREFER_PROJECT)
	repositories {
		maven {
			name = "GTNH Maven"
			url = uri("http://jenkins.usrv.eu:8081/nexus/content/groups/public/")
			isAllowInsecureProtocol = true
			mavenContent {
				includeGroup("com.gtnewhorizons")
				includeGroup("com.gtnewhorizons.retrofuturagradle")
			}
		}
		maven("https://maven.minecraftforge.net/")
		maven("https://maven.fabricmc.net")
		maven("https://repo.sleeping.town")
		maven("https://maven.architectury.dev/")
		maven("https://repo.sk1er.club/repository/maven-releases/")
		mavenLocal()
		mavenCentral()
		gradlePluginPortal()
	}
}

plugins {
	id("org.gradle.toolchains.foojay-resolver-convention") version "latest.release"
}

include(":1.3.2")
include(":1.4.7")
include(":1.5.2")
include(":1.6.4")
include(":1.7.10")
include(":1.8.9")
include(":1.9.4")
include(":1.10.2")
include(":1.11.2")
include(":1.12.2")
include(":1.13.2")
include(":1.14.4")
include(":1.15.2")
include(":1.16.5")
include(":1.17.1")
include(":1.18.2")
include(":1.19.4")
include(":1.20.6")