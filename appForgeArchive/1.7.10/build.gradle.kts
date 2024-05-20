import java.time.LocalDate
import java.time.format.DateTimeFormatter

plugins {
	id("com.gtnewhorizons.retrofuturagradle")
}

group = "com.github.hummel"
version = LocalDate.now().format(DateTimeFormatter.ofPattern("yy.MM.dd"))

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(8)
	}
}

minecraft {
	mcVersion = "1.7.10"
	username = "Hummel009"
}

tasks {
	withType<JavaCompile>().configureEach {
		options.encoding = "UTF-8"
	}
}