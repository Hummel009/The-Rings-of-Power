import java.time.LocalDate
import java.time.format.DateTimeFormatter

plugins {
	id("net.neoforged.gradle.userdev") version "latest.release"
}

group = "com.github.hummel"
version = LocalDate.now().format(DateTimeFormatter.ofPattern("yy.MM.dd"))

dependencies {
	implementation("net.neoforged:neoforge:21.1.23")
}

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(21)
	}
}

minecraft {
	runs {
		named("client") {
			modSource(project.sourceSets.main.get())
		}
		named("server") {
			modSource(project.sourceSets.main.get())
		}
	}
}

tasks {
	withType<JavaCompile> {
		options.encoding = "UTF-8"
	}
}
