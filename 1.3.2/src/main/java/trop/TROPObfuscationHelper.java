package trop;

import cpw.mods.fml.relauncher.ReflectionHelper;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.EntityLiving;
import net.minecraft.src.Item;
import net.minecraft.src.PotionEffect;

public class TROPObfuscationHelper {
	public static void addPotionEffect(EntityLiving entityLiving, PotionEffect potionEffect) {
		try {
			ReflectionHelper.findMethod(EntityLiving.class, null, new String[]{"d"}, PotionEffect.class).invoke(entityLiving, potionEffect);
		} catch (Exception e) {
			entityLiving.addPotionEffect(potionEffect);
		}
	}

	public static void setCreativeTab(Item item, CreativeTabs creativeTabs) {
		try {
			ReflectionHelper.setPrivateValue(Item.class, item, TROPCreativeTabs.TAB_RINGS, "a");
		} catch (Exception e) {
			item.setCreativeTab(TROPCreativeTabs.TAB_RINGS);
		}
	}

	public static void setIconIndex(Item item, int i) {
		try {
			ReflectionHelper.setPrivateValue(Item.class, item, i, "bV");
		} catch (Exception e) {
			item.setIconIndex(i);
		}
	}

	public static void setItemName(Item item, String s) {
		try {
			ReflectionHelper.setPrivateValue(Item.class, item, "item." + s, "bZ");
		} catch (Exception e) {
			item.setItemName(s);
		}
	}

	public static void setMaxDamage(Item item, int i) {
		try {
			ReflectionHelper.setPrivateValue(Item.class, item, 0, "b");
		} catch (Exception e) {
			item.setMaxDamage(0);
		}
	}

	public static void setMaxStackSize(Item item, int i) {
		try {
			ReflectionHelper.setPrivateValue(Item.class, item, 1, "bU");
		} catch (Exception e) {
			item.setMaxStackSize(1);
		}
	}
}