import java.time.LocalDate
import java.time.format.DateTimeFormatter

plugins {
	id("fabric-loom")
}

group = "com.github.hummel"
version = LocalDate.now().format(DateTimeFormatter.ofPattern("yy.MM.dd"))

dependencies {
	minecraft("com.mojang:minecraft:1.15.2")
	mappings(loom.officialMojangMappings())
	modImplementation("net.fabricmc:fabric-loader:latest.release")
	modImplementation("net.fabricmc.fabric-api:fabric-api:0.28.5+1.15")
}

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(8)
	}
}

tasks {
	withType<JavaCompile> {
		options.encoding = "UTF-8"
	}
}