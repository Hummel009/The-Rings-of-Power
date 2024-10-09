import java.time.LocalDate
import java.time.format.DateTimeFormatter

plugins {
	id("net.minecraftforge.gradle") version "latest.release"
}

group = "com.github.hummel"
version = LocalDate.now().format(DateTimeFormatter.ofPattern("yy.MM.dd"))

dependencies {
	minecraft("net.minecraftforge:forge:1.17.1-37.1.1")
}

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(16)
	}
}

minecraft {
	mappings("official", "1.17.1")
	runs {
		create("client") {
			workingDirectory(project.file("runs/client"))
		}
		create("server") {
			workingDirectory(project.file("runs/server"))
		}
	}
}

tasks {
	jar {
		finalizedBy("reobfJar")
	}
	withType<JavaCompile> {
		options.encoding = "UTF-8"
	}
}