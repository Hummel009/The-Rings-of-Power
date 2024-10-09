import java.time.LocalDate
import java.time.format.DateTimeFormatter

plugins {
	id("agency.highlysuspect.voldeloom") version "latest.release"
}

group = "com.github.hummel"
version = LocalDate.now().format(DateTimeFormatter.ofPattern("yy.MM.dd"))

val minecraftVersion: String = "1.5.2"
val forgeVersion: String = "1.5.2-7.8.1.738"

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