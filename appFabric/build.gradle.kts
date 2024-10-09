import java.time.LocalDate
import java.time.format.DateTimeFormatter

plugins {
	id("fabric-loom") version "latest.release"
}

group = "com.github.hummel"
version = LocalDate.now().format(DateTimeFormatter.ofPattern("yy.MM.dd"))

dependencies {
	minecraft("com.mojang:minecraft:1.21.1")
	mappings(loom.officialMojangMappings())
	modImplementation("net.fabricmc:fabric-loader:latest.release")
	modImplementation("net.fabricmc.fabric-api:fabric-api:0.105.0+1.21.1")
}

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(21)
	}
}

tasks {
	withType<JavaCompile> {
		options.encoding = "UTF-8"
	}
}