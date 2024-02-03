import java.time.LocalDate
import java.time.format.DateTimeFormatter

plugins {
	id("fabric-loom")
}

group = "hummel"
version = "v" + LocalDate.now().format(DateTimeFormatter.ofPattern("yy.MM.dd"))

dependencies {
	minecraft("com.mojang:minecraft:1.20.4")
	mappings("net.fabricmc:yarn:1.20.4+build.1:v2")
	modImplementation("net.fabricmc:fabric-loader:0.15.0")
	modImplementation("net.fabricmc.fabric-api:fabric-api:0.91.1+1.20.4")
}

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(17)
	}
}

tasks {
	withType<JavaCompile> {
		options.encoding = "UTF-8"
	}
}