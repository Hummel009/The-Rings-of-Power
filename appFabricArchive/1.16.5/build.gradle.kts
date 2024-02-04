import java.time.LocalDate
import java.time.format.DateTimeFormatter

plugins {
	id("fabric-loom")
}

group = "hummel"
version = "v" + LocalDate.now().format(DateTimeFormatter.ofPattern("yy.MM.dd"))

dependencies {
	minecraft("com.mojang:minecraft:1.16.5")
	mappings(loom.officialMojangMappings())
	modImplementation("net.fabricmc:fabric-loader:0.15.6")
	modImplementation("net.fabricmc.fabric-api:fabric-api:0.42.0+1.16")
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