import java.time.LocalDate
import java.time.format.DateTimeFormatter

plugins {
	id("fabric-loom")
}

group = "hummel"
version = "v" + LocalDate.now().format(DateTimeFormatter.ofPattern("yy.MM.dd"))

dependencies {
	minecraft("com.mojang:minecraft:1.19.4")
	mappings(loom.officialMojangMappings())
	modImplementation("net.fabricmc:fabric-loader:0.15.6")
	modImplementation("net.fabricmc.fabric-api:fabric-api:0.87.2+1.19.4")
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