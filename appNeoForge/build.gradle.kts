import java.time.LocalDate
import java.time.format.DateTimeFormatter

plugins {
	id("net.neoforged.gradle.userdev") version "7.0.80"
}

group = "com.github.hummel"
version = LocalDate.now().format(DateTimeFormatter.ofPattern("yy.MM.dd"))

dependencies {
	implementation("net.neoforged:neoforge:20.4.80-beta")
}

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(17)
	}
}

minecraft {
	runs {
		create("client") {
			modSource(project.sourceSets.main.get())
		}
	}
}

tasks {
	withType<JavaCompile> {
		options.encoding = "UTF-8"
	}
}