import dev.architectury.pack200.java.Pack200Adapter
import org.gradle.kotlin.dsl.configureEach
import java.time.LocalDate
import java.time.format.DateTimeFormatter

plugins {
	id("gg.essential.loom") version "latest.release"
	id("dev.architectury.architectury-pack200") version "latest.release"
}

group = "com.github.hummel"
version = LocalDate.now().format(DateTimeFormatter.ofPattern("yy.MM.dd"))

dependencies {
	minecraft("com.mojang:minecraft:1.12.2")
	mappings("de.oceanlabs.mcp:mcp_snapshot:20170615-1.12")
	forge("net.minecraftforge:forge:1.12.2-14.23.5.2847")
}

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(8)
	}
}

loom {
	forge {
		pack200Provider.set(Pack200Adapter())
	}
	runConfigs {
		"client" {}
		"server" {}
	}
}

sourceSets {
	main {
		output.setResourcesDir(sourceSets.main.flatMap {
			it.java.classesDirectory
		})
	}
}

tasks {
	withType<JavaCompile>().configureEach {
		options.encoding = "UTF-8"
	}
}