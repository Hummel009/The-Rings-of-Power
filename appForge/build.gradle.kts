import java.time.LocalDate
import java.time.format.DateTimeFormatter

plugins {
	id("net.minecraftforge.gradle") version "[6.0.24,6.2)"
}

group = "com.github.hummel"
version = LocalDate.now().format(DateTimeFormatter.ofPattern("yy.MM.dd"))

dependencies {
	minecraft("net.minecraftforge:forge:1.20.6-50.0.5")

	implementation("net.sf.jopt-simple:jopt-simple:5.0.4") {
		version {
			strictly("5.0.4")
		}
	}
}

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(21)
	}
}

minecraft {
	mappings("official", "1.20.6")
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