import java.time.LocalDate
import java.time.format.DateTimeFormatter

plugins {
	id("net.neoforged.gradle.userdev") version "7.0.138"
}

group = "com.github.hummel"
version = LocalDate.now().format(DateTimeFormatter.ofPattern("yy.MM.dd"))

dependencies {
	implementation("net.neoforged:neoforge:20.6.100-beta")
}

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(21)
	}
}

minecraft {
	runs {
		create("client") {
			modSource(project.sourceSets.main.get())
		}
		create("server") {
			modSource(project.sourceSets.main.get())
		}
	}
}

tasks {
	withType<JavaCompile> {
		options.encoding = "UTF-8"
	}
}