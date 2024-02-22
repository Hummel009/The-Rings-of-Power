import java.time.LocalDate
import java.time.format.DateTimeFormatter

plugins {
	id("net.minecraftforge.gradle") version "[6.0.16,6.2)"
}

group = "com.github.hummel"
version = LocalDate.now().format(DateTimeFormatter.ofPattern("yy.MM.dd"))

dependencies {
	minecraft("net.minecraftforge:forge:1.20.4-49.0.30")
}

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(17)
	}
}

minecraft {
	mappings("official", "1.20.4")
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

//Temporary fix for the problem in ForgeGradle
sourceSets.forEach {
	val dir = layout.buildDirectory.dir("sourcesSets/$it.name")
	it.output.setResourcesDir(dir)
	it.java.destinationDirectory = dir
}
