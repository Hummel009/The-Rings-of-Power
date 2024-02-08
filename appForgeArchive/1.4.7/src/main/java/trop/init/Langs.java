package trop.init;

import cpw.mods.fml.common.registry.LanguageRegistry;

public class Langs {
	private Langs() {
	}

	public static void onInit() {
		LanguageRegistry.instance().loadLocalization("/assets/trop/lang/en_US.lang", "en_US", false);
		LanguageRegistry.instance().loadLocalization("/assets/trop/lang/es_AR.lang", "es_AR", false);
		LanguageRegistry.instance().loadLocalization("/assets/trop/lang/es_ES.lang", "es_ES", false);
		LanguageRegistry.instance().loadLocalization("/assets/trop/lang/es_MX.lang", "es_MX", false);
		LanguageRegistry.instance().loadLocalization("/assets/trop/lang/es_UY.lang", "es_UY", false);
		LanguageRegistry.instance().loadLocalization("/assets/trop/lang/es_VE.lang", "es_VE", false);
		LanguageRegistry.instance().loadLocalization("/assets/trop/lang/ru_RU.lang", "ru_RU", false);
		LanguageRegistry.instance().loadLocalization("/assets/trop/lang/uk_UA.lang", "uk_UA", false);
		LanguageRegistry.instance().loadLocalization("/assets/trop/lang/zh_CN.lang", "zh_CN", false);
	}
}
