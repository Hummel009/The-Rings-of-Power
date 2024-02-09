package com.github.hummel.trop.init;

import com.github.hummel.trop.util.UnicodeHelper;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Langs {
	private Langs() {
	}

	public static void preInit() {
		LanguageRegistry instance = LanguageRegistry.instance();

		UnicodeHelper.loadLocalization(instance, "/assets/trop/lang/en_US.lang", "en_US");
		UnicodeHelper.loadLocalization(instance, "/assets/trop/lang/es_AR.lang", "es_AR");
		UnicodeHelper.loadLocalization(instance, "/assets/trop/lang/es_ES.lang", "es_ES");
		UnicodeHelper.loadLocalization(instance, "/assets/trop/lang/es_MX.lang", "es_MX");
		UnicodeHelper.loadLocalization(instance, "/assets/trop/lang/es_UY.lang", "es_UY");
		UnicodeHelper.loadLocalization(instance, "/assets/trop/lang/es_VE.lang", "es_VE");
		UnicodeHelper.loadLocalization(instance, "/assets/trop/lang/ru_RU.lang", "ru_RU");
		UnicodeHelper.loadLocalization(instance, "/assets/trop/lang/uk_UA.lang", "uk_UA");
		UnicodeHelper.loadLocalization(instance, "/assets/trop/lang/zh_CN.lang", "zh_CN");
	}
}
