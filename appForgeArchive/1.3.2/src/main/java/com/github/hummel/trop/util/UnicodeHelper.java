package com.github.hummel.trop.util;

import com.google.common.base.Charsets;
import cpw.mods.fml.common.registry.LanguageRegistry;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Properties;

public class UnicodeHelper {
	private UnicodeHelper() {
	}

	public static void loadLocalization(LanguageRegistry registry, String langFile, String langName) {
		URL url = registry.getClass().getResource(langFile);
		if (url != null) {
			loadLocalization(registry, url, langName);
		}
	}

	private static void loadLocalization(LanguageRegistry registry, URL langFile, String langName) {
		InputStream inputStream = null;
		try {
			inputStream = langFile.openStream();
			Properties properties = new Properties();
			properties.load(new InputStreamReader(inputStream, Charsets.UTF_8));
			registry.addStringLocalization(properties, langName);
		} catch (IOException e) {
		} finally {
			try {
				if (inputStream != null) {
					inputStream.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}