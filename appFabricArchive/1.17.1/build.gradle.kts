import java.time.LocalDate
import java.time.format.DateTimeFormatter

plugins {
	id("fabric-loom")
}

group = "hummel"
version = "v" + LocalDate.now().format(DateTimeFormatter.ofPattern("yy.MM.dd"))

dependencies {
	minecraft("com.mojang:minecraft:1.17.1")
	mappings(loom.officialMojangMappings())
	modImplementation("net.fabricmc:fabric-loader:0.15.6")
	modImplementation("net.fabricmc.fabric-api:fabric-api:0.46.1+1.17")
}

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(16)
	}
}

tasks {
	withType<JavaCompile> {
		options.encoding = "UTF-8"
	}
}