package trop;

import com.google.common.base.Charsets;
import cpw.mods.fml.common.registry.LanguageRegistry;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Properties;

public class TROPLang {
	public static void loadLocalization(LanguageRegistry registry, String langFile, String langName) {
		URL url = registry.getClass().getResource(langFile);
		if (url != null) {
			loadLocalization(registry, url, langName);
		}
	}

	public static void loadLocalization(LanguageRegistry registry, URL langFile, String langName) {
		InputStream inputStream = null;
		Properties properties = new Properties();
		try {
			inputStream = langFile.openStream();
			properties.load(new InputStreamReader(inputStream, Charsets.UTF_8));
			registry.addStringLocalization(properties, langName);
		} catch (IOException e) {
		} finally {
			try {
				if (inputStream != null) {
					inputStream.close();
				}
			} catch (IOException e) {
			}
		}
	}
}