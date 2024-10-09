import java.time.LocalDate
import java.time.format.DateTimeFormatter

plugins {
	id("net.minecraftforge.gradle") version "latest.release"
}

group = "com.github.hummel"
version = LocalDate.now().format(DateTimeFormatter.ofPattern("yy.MM.dd"))

dependencies {
	minecraft("net.minecraftforge:forge:1.15.2-31.2.57")
}

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(8)
	}
}

minecraft {
	mappings("official", "1.15.2")
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