import dev.architectury.pack200.java.Pack200Adapter
import java.time.LocalDate
import java.time.format.DateTimeFormatter

plugins {
	id("gg.essential.loom") version "0.10.0.+"
	id("dev.architectury.architectury-pack200") version "0.1.3"
}

group = "com.github.hummel"
version = LocalDate.now().format(DateTimeFormatter.ofPattern("yy.MM.dd"))

dependencies {
	minecraft("com.mojang:minecraft:1.9.4")
	mappings("de.oceanlabs.mcp:mcp_snapshot:20160518-1.9.4")
	forge("net.minecraftforge:forge:1.9.4-12.17.0.2317-1.9.4")
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