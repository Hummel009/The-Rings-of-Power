import java.time.LocalDate
import java.time.format.DateTimeFormatter

plugins {
	id("agency.highlysuspect.voldeloom") version "2.5-SNAPSHOT"
}

group = "hummel"
version = "v" + LocalDate.now().format(DateTimeFormatter.ofPattern("yy.MM.dd"))

val minecraftVersion: String = "1.6.4"
val forgeVersion: String = "1.6.4-9.11.1.1345"

dependencies {
	minecraft("com.mojang:minecraft:$minecraftVersion")
	forge("net.minecraftforge:forge:$forgeVersion:universal")
	mappings("net.minecraftforge:forge:$forgeVersion:src@zip")
}

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(11)
	}
}

tasks {
	compileJava {
		options.release.set(6)
	}
	withType<JavaCompile> {
		options.encoding = "UTF-8"
	}
}