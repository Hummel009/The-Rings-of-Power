import dev.architectury.pack200.java.Pack200Adapter
import java.time.LocalDate
import java.time.format.DateTimeFormatter

plugins {
	id("gg.essential.loom") version "latest.release"
	id("dev.architectury.architectury-pack200") version "latest.release"
}

group = "com.github.hummel"
version = LocalDate.now().format(DateTimeFormatter.ofPattern("yy.MM.dd"))

dependencies {
	minecraft("com.mojang:minecraft:1.8.9")
	mappings("de.oceanlabs.mcp:mcp_stable:22-1.8.9")
	forge("net.minecraftforge:forge:1.8.9-11.15.1.2318-1.8.9")
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