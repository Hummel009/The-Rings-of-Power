import java.time.LocalDate
import java.time.format.DateTimeFormatter

plugins {
	id("agency.highlysuspect.voldeloom") version "2.5-SNAPSHOT"
}

group = "hummel"
version = "v" + LocalDate.now().format(DateTimeFormatter.ofPattern("yy.MM.dd"))

val minecraftVersion: String = "1.4.7"
val forgeVersion: String = "1.4.7-6.6.2.534"

dependencies {
	minecraft("com.mojang:minecraft:$minecraftVersion")
	forge("net.minecraftforge:forge:$forgeVersion:universal@zip")
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