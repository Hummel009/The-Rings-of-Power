package trop.init;

import cpw.mods.fml.common.registry.LanguageRegistry;

public class Langs {
	private Langs() {
	}

	public static void preInit() {
		LanguageRegistry instance = LanguageRegistry.instance();

		instance.loadLocalization("/assets/trop/lang/en_US.lang", "en_US", false);
		instance.loadLocalization("/assets/trop/lang/es_AR.lang", "es_AR", false);
		instance.loadLocalization("/assets/trop/lang/es_ES.lang", "es_ES", false);
		instance.loadLocalization("/assets/trop/lang/es_MX.lang", "es_MX", false);
		instance.loadLocalization("/assets/trop/lang/es_UY.lang", "es_UY", false);
		instance.loadLocalization("/assets/trop/lang/es_VE.lang", "es_VE", false);
		instance.loadLocalization("/assets/trop/lang/ru_RU.lang", "ru_RU", false);
		instance.loadLocalization("/assets/trop/lang/uk_UA.lang", "uk_UA", false);
		instance.loadLocalization("/assets/trop/lang/zh_CN.lang", "zh_CN", false);
	}
}
