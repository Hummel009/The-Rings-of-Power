import java.time.LocalDate
import java.time.format.DateTimeFormatter

plugins {
	id("net.minecraftforge.gradle") version "[6.0.16,6.2)"
}

group = "hummel"
version = "v" + LocalDate.now().format(DateTimeFormatter.ofPattern("yy.MM.dd"))

dependencies {
	minecraft("net.minecraftforge:forge:1.20.2-48.0.30")
}

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(17)
	}
}

minecraft {
	mappings("official", "1.20.2")
	runs {
		create("client") {
			workingDirectory(project.file("run"))
			property("forge.logging.markers", "REGISTRIES")
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